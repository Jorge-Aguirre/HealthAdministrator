package com.jorgeaguirre.healthadministrator.controller;

import com.jorgeaguirre.healthadministrator.domain.Person;
import com.jorgeaguirre.healthadministrator.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<Person> people() {
        return personService.findAll();
    }
}
