package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import com.jorgeaguirre.healthadministrator.domain.Person;
import com.jorgeaguirre.healthadministrator.repository.PatientRepository;
import com.jorgeaguirre.healthadministrator.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;
    private PersonRepository personRepository;

    public PatientServiceImpl(PatientRepository patientRepository, PersonRepository personRepository) {

        this.patientRepository = patientRepository;
        this.personRepository = personRepository;
    }

    @Override
    public List<Patient> findAll() {

        return patientRepository.findAll();
    }

    @Override
    public List<Patient> findByHospital(String hospital) {

        return patientRepository.findByHospitals(hospital);
    }

    @Override
    public Optional<Patient> findByHospitalAndId(String hospital, String id) {

        return patientRepository.findByHospitalsAndId(hospital, id);
    }

    @Override
    public Patient save(String hospital, Patient patient) {

        patient.getHospitals().add(hospital);
        Person savedPerson = personRepository.save(patient.getPerson());
        patient.setPerson(savedPerson);
        
        return patientRepository.save(patient);
    }
}
