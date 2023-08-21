package com.arsf.arsf.config.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class DataEtlService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void executeSqlScript(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                jdbcTemplate.execute(line);
            }
        }
    }

    public void executeSqlScriptproc(String proc) throws IOException {
                jdbcTemplate.execute(proc);
            }
}



