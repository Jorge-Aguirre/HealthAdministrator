package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> findAll();
    List<Doctor> findByHospital(String hospital);
}
