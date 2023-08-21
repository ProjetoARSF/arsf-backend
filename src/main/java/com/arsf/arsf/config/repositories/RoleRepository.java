package com.arsf.arsf.config.repositories;

import com.arsf.arsf.config.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>{

    List<Role> findByIdApp(String idApp);

}
