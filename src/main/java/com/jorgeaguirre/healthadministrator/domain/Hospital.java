package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "hospitals")
public class Hospital {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    @DBRef
    @Setter
    private TrailEntry trailEntry;

    public Hospital() {}

    public Hospital(String name) {

        this.name = name;
    }
}
