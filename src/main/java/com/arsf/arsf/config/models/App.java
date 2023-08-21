package com.arsf.arsf.config.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbapps", schema = "rsf")
public class App {

    @Id
    @Column(name = "id_app", nullable = false)
    private String idApp;

    @Column(name = "app_name", nullable = false)
    private String appName;

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
