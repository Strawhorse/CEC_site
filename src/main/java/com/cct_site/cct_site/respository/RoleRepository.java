package com.cct_site.cct_site.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cct_site.cct_site.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

//    two parameters above; the entity type, Role, and the type of the primary key in database, Long

    Role findByName(String name);

}
