package com.arsf.arsf.config.repositories;

import com.arsf.arsf.config.models.App;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppRepository extends JpaRepository<App, String>{
}
