package jp.co.axio.masterMentsetSystem.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> executeSqlQuery(String sql) {
        // 任意のSQL文を実行し、結果を返す
        return jdbcTemplate.queryForList(sql);
    }
    
    public int count(String sql) {
    	// 任意のSQL文を実行し、結果を返す
    	return jdbcTemplate.queryForObject(sql, Integer.class);
    }
    
    public String getString(String sql) {
    	
    	// 任意のSQL文を実行し、結果を返す
    	return jdbcTemplate.queryForObject(sql, String.class);
    }
    
    
    public int update(String sql) {
    	// 任意のSQL文を実行し、結果を返す
    	return jdbcTemplate.update(sql);
    }
    
    public void execute(String sql) {
    	// 任意のSQL文を実行し、結果を返す
    	jdbcTemplate.execute(sql);
    }
}