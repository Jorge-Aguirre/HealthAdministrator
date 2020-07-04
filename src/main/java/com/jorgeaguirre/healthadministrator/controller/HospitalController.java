package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.service.HospitalService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity createHospital(@RequestBody Hospital hospital) {

        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(hospitalService.save(hospital));
        } catch (DuplicateKeyException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
