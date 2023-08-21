package com.arsf.arsf.config.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class RiskAnalysisService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static class QueryResult {
        private List<Map<String, Object>> rows;

        public QueryResult(List<Map<String, Object>> rows) {
            this.rows = rows;
        }

        public List<Map<String, Object>> getRows() {
            return rows;
        }
    }

    public QueryResult executeSqlScript(String vwrisk) throws IOException {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(vwrisk);
        return new QueryResult(rows);
    }
}
