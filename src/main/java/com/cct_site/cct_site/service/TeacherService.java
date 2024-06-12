package com.cct_site.cct_site.service;

import com.cct_site.cct_site.entity.Teacher;

public interface TeacherService {

    void saveUser(TeacherDTO teacherDTO);

    Teacher findTeacherByEmail(String email);

    List<TeacherDTO> findAllTeachers;

}
