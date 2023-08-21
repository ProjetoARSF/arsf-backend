package com.arsf.arsf.config.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbfeatures", schema = "rsf")
public class Feature {
    @Id
    @Column(name = "id_feature", nullable = false)
    private String idFeature;

    @Column(name = "id_app", nullable = false)
    private String idApp;

    @Column(name = "feature_desc", nullable = false)
    private String featureDesc;

    public String getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(String idFeature) {
        this.idFeature = idFeature;
    }

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getFeatureDesc() {
        return featureDesc;
    }

    public void setFeatureDesc(String featureDesc) {
        this.featureDesc = featureDesc;
    }
}
