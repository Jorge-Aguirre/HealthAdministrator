package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends MongoRepository<Patient, String> {

    List<Patient> findByHospitals(String hospital);
    Optional<Patient> findByHospitalsAndId(String hospital, String id);
}
