package com.cts.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cts.spring.jdbc.dao.EmployeeDAO;
import com.cts.spring.jdbc.dao.EmployeeDAOImpl1;

@Configuration
@ComponentScan("com.cts.spring.jdbc")
public class SpringJdbcConfig {
	@Bean
    public DataSource myDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ashutosh");
        dataSource.setUsername("root");
        dataSource.setPassword("root"); 
        return dataSource;
    }
	
	@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
	
	@Bean("employeeDAO")
    public EmployeeDAO employeeDAO(JdbcTemplate jdbcTemplate) {
        return new EmployeeDAOImpl1(jdbcTemplate);
    }
}
