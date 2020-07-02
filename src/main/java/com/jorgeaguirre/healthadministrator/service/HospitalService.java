package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Hospital;

import java.util.List;

public interface HospitalService {

    List<Hospital> findAll();
}
