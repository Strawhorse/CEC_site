package com.cct_site.cct_site.respository;

import com.cct_site.cct_site.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findByEmail(String email);

//    JpaRepository interface provides several methods for performing CRUD (Create, Read, Update, Delete) operations on a JPA entity.
//    Two type parameters: the entity type, User, and the type of the entity's primary key, Long.

}
