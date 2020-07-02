package com.jorgeaguirre.healthadministrator.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hospitals")
public class Hospital {

    @Id
    private String id;

    private String name;

    protected Hospital() {}

    public Hospital(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Hospital[id='%s', name='%s']",
                id, name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
