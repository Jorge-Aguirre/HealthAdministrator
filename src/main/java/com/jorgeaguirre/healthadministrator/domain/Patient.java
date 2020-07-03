package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Document(collection = "patients")
public class Patient {

    @DBRef
    private Person person;

    @Field("attendedIn")
    private List<String> hospitals;

    public Patient(Person person) {

        this.person = person;
    }
}
