package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import com.jorgeaguirre.healthadministrator.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {

        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {

        return patientRepository.findAll();
    }

    @Override
    public List<Patient> findByHospital(String hospital) {

        return patientRepository.findByHospitals(hospital);
    }
}
