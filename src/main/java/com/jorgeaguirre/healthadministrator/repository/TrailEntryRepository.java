package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.TrailEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrailEntryRepository extends MongoRepository<TrailEntry, String> {


}
