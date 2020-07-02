package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import com.jorgeaguirre.healthadministrator.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctors")
    public List<Doctor> doctors() {
        return doctorService.findAll();
    }
}
