package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Document(collection = "people")
public class Person {

    @Id
    private String id;

    private String name;

    private String lastName;

    private Date birthDate;

    private String address;

    public Person(String name, String lastName, Date birthDate, String address) {

        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }
}
