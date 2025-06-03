package com.cts.spring.jdbc.dao;

import com.cts.spring.jdbc.bean.Employee;

public interface EmployeeDAO {
	public int save(Employee employee);
	public int delete(int eid);
	public int update(int eid,int esalary);
}
