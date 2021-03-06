package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@NoArgsConstructor
@Document(collection = "patients")
public class Patient {

    @Id
    private String id;

    @DBRef
    @Setter
    private Person person;

    @DBRef
    @Setter
    private List<Note> notes;

    @Field("attendedIn")
    private List<String> hospitals;

    @DBRef
    @Setter
    private TrailEntry trailEntry;

    public Patient(Person person) {

        this.person = person;
    }
}
