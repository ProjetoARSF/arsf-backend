package com.arsf.arsf.config.endpoints;

import com.arsf.arsf.config.services.DataEtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataEtlController {

    @Autowired
    private DataEtlService dataEtlService;

    String filePath = "/home/julio/Documents/Projetos/script.sql";

    @GetMapping("/execute-script")
    public String executeScript() {
        try {
            dataEtlService.executeSqlScript(filePath);
            return "Script executed successfully.";
        } catch (Exception e) {
            return "Error executing script: " + e.getMessage();
        }

    }

    String proc = "call dataetl()";
    @GetMapping("/execute-script-proc")
    public String executeScriptproc() {
        try {
            dataEtlService.executeSqlScriptproc(proc);
            return "Script executed successfully.";
        } catch (Exception e) {
            return "Error executing script: " + e.getMessage();
        }
    }
}


