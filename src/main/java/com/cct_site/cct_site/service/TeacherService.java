package com.cct_site.cct_site.service;

import com.cct_site.cct_site.dto.TeacherDTO;
import com.cct_site.cct_site.entity.Teacher;

import java.util.List;

public interface TeacherService {

    void saveTeacher(TeacherDTO userDto);

    Teacher findUserByEmail(String email);

    List<TeacherDTO> findAllUsers();

}
