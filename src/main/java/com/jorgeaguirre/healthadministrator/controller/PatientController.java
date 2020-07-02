package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import com.jorgeaguirre.healthadministrator.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient> patients() {
        return patientService.findAll();
    }
}
