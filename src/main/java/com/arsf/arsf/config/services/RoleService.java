package com.arsf.arsf.config.services;


import com.arsf.arsf.config.models.Role;
import com.arsf.arsf.config.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(String idRole) {
        return roleRepository.findById(idRole);
    }

    public List<Role> getRoleAppById(String idApp) {
        return roleRepository.findByIdApp(idApp);
    }

}
