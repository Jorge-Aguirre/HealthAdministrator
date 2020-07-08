package com.jorgeaguirre.healthadministrator.repository;

import com.jorgeaguirre.healthadministrator.domain.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NoteRepository extends MongoRepository<Note, String> {


}
