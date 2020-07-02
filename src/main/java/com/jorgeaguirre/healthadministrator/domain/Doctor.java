package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "doctors")
public class Doctor {

    @DBRef
    private Person person;

    public Doctor(Person person) {

        this.person = person;
    }
}
