package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    List<Hospital> findAll();
    Optional<Hospital> findById(String id);
    Hospital save(Hospital hospital);
}
