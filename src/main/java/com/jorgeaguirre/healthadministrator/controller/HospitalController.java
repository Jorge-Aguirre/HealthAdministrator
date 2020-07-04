package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.service.HospitalService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {

        this.hospitalService = hospitalService;
    }

    @GetMapping("/hospitals")
    public ResponseEntity hospitals() {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(hospitalService.findAll());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/hospitals/{id}")
    public ResponseEntity hospital(@PathVariable String id) {

        try {
            Optional<Hospital> hospital = hospitalService.findById(id);

            return hospital.isPresent() ?
                    ResponseEntity
                        .status(HttpStatus.OK)
                        .body(hospital.get()) :
                    ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .build();
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    @PostMapping("/hospitals")
    public ResponseEntity createHospital(@RequestBody Hospital hospital) {

        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(hospitalService.save(hospital));
        } catch (DuplicateKeyException e) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(e.getMessage());
        }
    }
}
