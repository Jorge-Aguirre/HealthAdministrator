package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    List<Patient> findByHospital(String hospital);
}
