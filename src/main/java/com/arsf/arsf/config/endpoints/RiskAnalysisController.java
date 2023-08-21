package com.arsf.arsf.config.endpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.arsf.arsf.config.services.RiskAnalysisService;
import com.arsf.arsf.config.services.RiskAnalysisService.QueryResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;


@RestController
@RequestMapping("/riskanalysis")
public class RiskAnalysisController {
    @Autowired
    private RiskAnalysisService riskAnalysisService;

    private String vwrisk;

    @GetMapping("/user/{idApp}")
    public QueryResult getUsers(@PathVariable String idApp) {
        String vwrisk = "select * from vwusersgroupriskanalysis where id_app = '" + idApp +"'";
        return executeScript(vwrisk);
    }


    @GetMapping("/role/{idApp}")
    public QueryResult getRoles(@PathVariable String idApp) {
        vwrisk = "select * from vwrolesriskanalysis where id_app = '" + idApp +"'";
        return executeScript(vwrisk);
    }

    @GetMapping("/group/{idApp}")
    public QueryResult getGroups(@PathVariable String idApp) {
        vwrisk = "select * from vwrolesgroupriskanalysis where id_app = '" + idApp +"'";
        return executeScript(vwrisk);
    }

    private QueryResult executeScript(String vwrisk) {
        try {
            return riskAnalysisService.executeSqlScript(vwrisk);
        } catch (Exception e) {
            e.printStackTrace();
            return new QueryResult(Collections.emptyList()); // Retorna uma lista vazia em caso de erro
        }
    }


}
