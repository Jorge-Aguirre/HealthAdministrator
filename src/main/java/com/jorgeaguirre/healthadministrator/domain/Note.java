package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@NoArgsConstructor
@Document(collection = "notes")
public class Note {

    @Id
    private String id;

    private String hospitalId;

    private String doctorId;

    private String patientId;

    private String description;

    private Date date;

    @DBRef
    @Setter
    private TrailEntry trailEntry;
}
