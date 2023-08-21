package com.arsf.arsf.config.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbroles", schema = "rsf")
public class Role {

    @Id
    @Column(name = "id_role", nullable = false)
    private String idRole;

    @Column(name = "id_app", nullable = false)
    private String idApp;

    @Column(name = "role_desc", nullable = false)
    private String roleDesc;

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
