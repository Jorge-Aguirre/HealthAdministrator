package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {

        this.hospitalService = hospitalService;
    }

    @GetMapping("/hospitals")
    public List<Hospital> hospitals() {

        return hospitalService.findAll();
    }

    @GetMapping("/hospitals/{id}")
    public Optional<Hospital> hospital(@PathVariable String id) {

        return hospitalService.findById(id);
    }

    @PostMapping("/hospitals")
    public Hospital createHospital(@RequestBody Hospital hospital) {

        return hospitalService.save(hospital);
    }
}
