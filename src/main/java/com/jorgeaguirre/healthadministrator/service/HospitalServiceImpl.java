package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    private HospitalRepository hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this. hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }
}
