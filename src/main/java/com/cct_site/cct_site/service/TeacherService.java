package com.cct_site.cct_site.service;

import com.cct_site.cct_site.entity.Teacher;

public interface TeacherService {

    void saveTeacher(TeacherDTO teacherDTO);

    Teacher findTeacherByEmail(String email);

    List<TeacherDTO> findAllTeachers;

}
