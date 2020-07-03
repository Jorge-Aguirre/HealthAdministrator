package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import com.jorgeaguirre.healthadministrator.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/patients/{id}")
    public Optional<Patient> patient(@PathVariable String hospitalId, @PathVariable String id) {

        return patientService.findByHospitalAndId(hospitalId, id);
    }

    @PostMapping("/patients")
    public Patient createPatient(@PathVariable String hospitalId, @RequestBody Patient patient) {

        return patientService.save(hospitalId, patient);
    }
}
