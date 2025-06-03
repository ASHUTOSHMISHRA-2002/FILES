package com.cts.spring.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.spring.jdbc.bean.Employee;

@Repository
public class EmployeeDAOImpl1 implements EmployeeDAO {
	
    private JdbcTemplate jdbcTemplate;
	
    @Autowired
    public EmployeeDAOImpl1(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Transactional
	public int save(Employee employee) {
		String sql = "insert into employee values (?, ?, ?)";
        int n = jdbcTemplate.update(sql, employee.getEid(), employee.getEname(), employee.getEsalary());//update() using var_args		
	    return n;
    }
    
    @Transactional
    public int delete(int eid) {
        String sql = "DELETE FROM Employee WHERE eid = ?";
        int n = jdbcTemplate.update(sql,eid);
        return n;
    }

    @Transactional
    public int update(int eid, int esalary) {
        String sql = "UPDATE EMPLOYEE SET esalary = ? WHERE eid = ?";
        int n = jdbcTemplate.update(sql, esalary, eid);
        return n;
    }

}
