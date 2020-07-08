package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
