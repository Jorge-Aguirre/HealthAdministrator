package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    List<Doctor> findAll();
    List<Doctor> findByHospital(String hospital);
    Optional<Doctor> findByHospitalAndId(String hospital, String id);
    Doctor save(String hospital, Doctor doctor);
}
