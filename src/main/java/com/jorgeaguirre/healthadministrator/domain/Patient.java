package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "patients")
public class Patient {

    @DBRef
    private Person person;

    public Patient(Person person) {

        this.person = person;
    }
}
