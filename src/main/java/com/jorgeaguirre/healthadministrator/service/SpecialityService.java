package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import com.jorgeaguirre.healthadministrator.domain.Speciality;

import java.util.List;
import java.util.Optional;

public interface SpecialityService {

    List<Speciality> findByHospitalAndDoctor(String hospital, String doctor);
    Optional<Speciality> findByHospitalAndDoctorAndId(String hospital, String doctor, String id);
    Speciality save(String hospital, Doctor doctor, Speciality speciality);
}
