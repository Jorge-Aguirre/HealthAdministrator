package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(String username);
}
