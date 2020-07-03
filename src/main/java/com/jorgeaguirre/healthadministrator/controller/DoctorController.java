package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import com.jorgeaguirre.healthadministrator.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospitals/{hospitalId}")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {

        this.doctorService = doctorService;
    }

    @GetMapping(value = "/doctors")
    public List<Doctor> doctors(@PathVariable String hospitalId) {

        return doctorService.findByHospital(hospitalId);
    }

    @GetMapping(value = "/doctors/{id}")
    public Optional<Doctor> doctor(@PathVariable String hospitalId, @PathVariable String id) {

        return doctorService.findByHospitalAndId(hospitalId, id);
    }

    @PostMapping(value = "/doctors")
    public Doctor createDoctor(@PathVariable String hospitalId, @RequestBody Doctor doctor) {

        return doctorService.save(hospitalId, doctor);
    }
}
