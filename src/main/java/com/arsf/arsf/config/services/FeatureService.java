package com.arsf.arsf.config.services;

import com.arsf.arsf.config.models.Feature;
import com.arsf.arsf.config.repositories.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FeatureService {

    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureService(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    public List<Feature> getAllFeatures() {
        return featureRepository.findAll();
    }

    public Optional<Feature> getFeatureById(String idFeature) {
        return featureRepository.findById(idFeature);
    }

    public List<Feature> getFeatureAppById(String idApp) {
        return featureRepository.findByIdApp(idApp);
    }
}
