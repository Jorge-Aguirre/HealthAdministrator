package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

}
