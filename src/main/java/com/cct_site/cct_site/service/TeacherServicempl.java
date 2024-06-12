package com.cct_site.cct_site.service;

import com.cct_site.cct_site.respository.RoleRepository;
import com.cct_site.cct_site.respository.TeacherRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherServicempl implements TeacherService{

    private TeacherRepository teacherRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public TeacherServicempl(TeacherRepository teacherRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.teacherRepository = teacherRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveTeacher(TeacherDTO teacherDTO) {
        
    }


}
