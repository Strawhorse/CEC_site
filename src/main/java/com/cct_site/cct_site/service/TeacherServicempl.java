package com.cct_site.cct_site.service;

import com.cct_site.cct_site.entity.Role;
import com.cct_site.cct_site.entity.Teacher;
import com.cct_site.cct_site.respository.RoleRepository;
import com.cct_site.cct_site.respository.TeacherRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//The TeacherServicempl class implements the TeacherService interface, which defines several methods for working with users.

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
        Teacher teacher = new Teacher();
        teacher.setName(teacherDTO.getFirstName() + " " + teacherDTO.getLastName());
        teacher.getEmail(teacherDTO.getEmail());


//        use Spring Security to encrypt password
        teacher.setPassword(passwordEncoder.encode(teacherDTO.getPassword()));


        Role role = roleRepository.findByName("ROLE_ADMIN");
        if (role == null) {
            role.checkRoleExist();
        }
        teacher.setRoles(Arrays.asList(role));
        teacherRepository.save(teacher);

    }

    @Override
    public Teacher findTeacherByEmail(String email) {
        return teacherRepository.findByEmail(email);
    }


    public List<TeacherDTO> findAllTeachers(){
        List<Teacher> teachers = teacherRepository.findAll();
        List<TeacherDTO> collect = teachers.stream().map((teacher) -> mapToTeacherDTO(teacher)).collect(Collectors.toList());
        return collect;
    }


    private TeacherDTO mapToTeacherDTO(Teacher teacher) {
        TeacherDTO teacherDTO = new TeacherDTO();
        String[] str = teacher.getName().split(" ");
        teacherDTO.setFirstName(str[0]);
        teacherDTO.setLastName(str[1]);
        teacherDTO.setEmail(teacher.getEmail());
        return teacherDTO;
    }


//    Now a method to check that the role exists
    private Role checkRoleExist() {
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        return roleRepository.save(role);
    }

}
