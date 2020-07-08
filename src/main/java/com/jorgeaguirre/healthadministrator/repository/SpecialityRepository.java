package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Speciality;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpecialityRepository extends MongoRepository<Speciality, String> {


}
