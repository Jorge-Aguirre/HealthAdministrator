package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository  extends MongoRepository<Doctor, String> {

}
