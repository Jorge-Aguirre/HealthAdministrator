package com.jorgeaguirre.healthadministrator.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@NoArgsConstructor
@Document(collection = "trailEntries")
public class TrailEntry {

    @Id
    private String id;

    private Date createdDate;

    private Date modifiedDate;

    private String createdById;

    private String modifiedById;
}
