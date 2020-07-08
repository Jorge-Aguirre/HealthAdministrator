package com.jorgeaguirre.healthadministrator.service;

import com.jorgeaguirre.healthadministrator.domain.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    List<Note> findByHospitalAndDoctor(String hospital, String doctor);
    Optional<Note> findByHospitalAndDoctorAndId(String hospital, String doctor, String id);
    Note save(String hospital, String doctor, Note note);
}
