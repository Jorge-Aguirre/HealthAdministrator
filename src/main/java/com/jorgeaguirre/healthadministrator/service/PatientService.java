package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    List<Patient> findAll();
    List<Patient> findByHospital(String hospital);
    Optional<Patient> findByHospitalAndId(String hospital, String id);
    Patient save(String hospitalId, Patient patient);
}
