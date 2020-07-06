package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "specialities")
public class Speciality {

    @Id
    private String id;

    private String name;

    private String description;

    @DBRef
    @Setter
    private TrailEntry trailEntry;
}
