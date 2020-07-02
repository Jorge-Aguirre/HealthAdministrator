package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "hospitals")
public class Hospital {

    @Id
    private String id;

    private String name;

    public Hospital(String name) {
        this.name = name;
    }
}
