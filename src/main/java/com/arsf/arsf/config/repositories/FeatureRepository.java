package com.arsf.arsf.config.repositories;
import com.arsf.arsf.config.models.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository <Feature, String>{
    List<Feature> findByIdApp(String idApp);
}
