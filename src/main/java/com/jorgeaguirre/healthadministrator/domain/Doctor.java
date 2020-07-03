package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Document(collection = "doctors")
public class Doctor {

    @DBRef
    private Person person;

    @Field("workingAt")
    private List<String> hospitals;

    public Doctor() {}

    public Doctor(Person person) {

        this.person = person;
    }
}
