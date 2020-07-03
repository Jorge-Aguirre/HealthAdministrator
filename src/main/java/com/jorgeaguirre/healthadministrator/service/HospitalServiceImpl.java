package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {

    private HospitalRepository hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {

        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> findAll() {

        return hospitalRepository.findAll();
    }

    @Override
    public Optional<Hospital> findById(String id) {

        return hospitalRepository.findById(id);
    }

    @Override
    public Hospital save(Hospital hospital) {

        return hospitalRepository.save(hospital);
    }
}
