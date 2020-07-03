package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import com.jorgeaguirre.healthadministrator.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospitals/{hospitalId}")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {

        this.patientService = patientService;
    }

    @GetMapping(value = "/patients")
    public List<Patient> patients(@PathVariable String hospitalId) {

        return patientService.findByHospital(hospitalId);
    }
}
