package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();
}
