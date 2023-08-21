package com.arsf.arsf.config.services;

import com.arsf.arsf.config.models.App;
import com.arsf.arsf.config.repositories.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppService {

    private final AppRepository appRepository;

    @Autowired
    public AppService(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public List<App> getAllApps() {
        return appRepository.findAll();
    }

    public Optional<App> getAppById(String idApp) {
        return appRepository.findById(idApp);
    }

}
