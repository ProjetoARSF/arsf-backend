package com.arsf.arsf.config.endpoints;

import com.arsf.arsf.config.models.App;
import com.arsf.arsf.config.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {
    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping
    public List<App> getAllApps() {
        return appService.getAllApps();
    }

    @GetMapping("/{id}")
    public ResponseEntity<App> getAppById(@PathVariable String id) {
        Optional<App> app = appService.getAppById(id);
        return app.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



}
