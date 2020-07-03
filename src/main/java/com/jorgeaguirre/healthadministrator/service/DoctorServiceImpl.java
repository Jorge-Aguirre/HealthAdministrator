package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import com.jorgeaguirre.healthadministrator.domain.Person;
import com.jorgeaguirre.healthadministrator.repository.DoctorRepository;
import com.jorgeaguirre.healthadministrator.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository doctorRepository;
    private PersonRepository personRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository, PersonRepository personRepository) {

        this.doctorRepository = doctorRepository;
        this.personRepository = personRepository;
    }

    @Override
    public List<Doctor> findAll() {

        return doctorRepository.findAll();
    }

    @Override
    public List<Doctor> findByHospital(String hospital) {

        return doctorRepository.findByHospitals(hospital);
    }

    @Override
    public Optional<Doctor> findByHospitalAndId(String hospital, String id) {

        return doctorRepository.findByHospitalsAndId(hospital, id);
    }

    @Override
    public Doctor save(String hospital, Doctor doctor) {

        doctor.getHospitals().add(hospital);
        Person savedPerson = personRepository.save(doctor.getPerson());
        doctor.setPerson(savedPerson);

        return doctorRepository.save(doctor);
    }
}
