package com.cts.spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.spring.jdbc.bean.Employee;
import com.cts.spring.jdbc.dao.EmployeeDAO;

//Spring Data Access using JDBC with XML configuration
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-JDBC.xml");
		EmployeeDAO employeeDAO  = (EmployeeDAO) context.getBean("employeeDAO");
		//Inserting a Record
		/*
		Employee employee = new Employee();
		employee.setEid(2);
		employee.setEname("Sphinx");
		employee.setEsalsary(1500000);
		
		int n = employeeDAO.save(employee);
		if(n==1) {
			System.out.println("Employee Record Saved");
		}else {
			System.out.println("Employee Record Not Saved");
		}
		*/
		
		//Deleting a Record
//	
//		int eid=450;
//		int n=employeeDAO.delete(eid);
//		if(n==1) {
//			System.out.println("Employee Record is Deleted");
//		}else {
//			System.out.println("Employee Record is Not Deleted");
//		}
		
		
	
		//Update a Record
//		int eid=501;
//		int newSalary=75000;
//		int n=employeeDAO.update(eid,newSalary);
//		if(n==1) {
//			System.out.println("Employee Record is Updated");
//		}else {
//			System.out.println("Employee Record is Not Updated");
//		}

	}

}
