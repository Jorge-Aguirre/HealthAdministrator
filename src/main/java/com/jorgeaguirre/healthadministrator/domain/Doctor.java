package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Getter
@NoArgsConstructor
@Document(collection = "doctors")
public class Doctor {

    @Id
    private String id;

    @DBRef
    @Setter
    private Person person;

    @Field("workingAt")
    private Set<String> hospitals;

    public Doctor(Person person) {

        this.person = person;
    }
}
