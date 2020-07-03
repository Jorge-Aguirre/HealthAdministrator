package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import com.jorgeaguirre.healthadministrator.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {

        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctor> findAll() {

        return doctorRepository.findAll();
    }

    @Override
    public List<Doctor> findByHospital(String hospital) {

        return doctorRepository.findByHospitals(hospital);
    }
}
