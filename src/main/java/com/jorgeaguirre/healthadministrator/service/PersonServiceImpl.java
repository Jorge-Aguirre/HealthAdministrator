package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Person;
import com.jorgeaguirre.healthadministrator.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {

        return personRepository.findAll();
    }
}
