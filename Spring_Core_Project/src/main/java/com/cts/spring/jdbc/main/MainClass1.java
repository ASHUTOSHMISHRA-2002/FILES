package com.cts.spring.jdbc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.spring.jdbc.bean.Employee;
import com.cts.spring.jdbc.config.SpringJdbcConfig;
import com.cts.spring.jdbc.dao.EmployeeDAO;

public class MainClass1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		EmployeeDAO employeeDao = (EmployeeDAO) context.getBean("employeeDAO");
		Employee employee = new Employee();
		employee.setEid(510);
		employee.setEname("hathor");
		employee.setEsalary(10200);
		
//		int n = employeeDao.save(employee);
//		if(n == 1){
//			System.out.println("Employee Record Saved");
//		}else {
//			System.out.println("Employee Record Not Saved");
//	}
		

//        int n = employeeDao.delete(employee.getEid());  // Fixed syntax
//        if(n == 1){
//            System.out.println("Employee Record Deleted");
//        }else {
//            System.out.println("Employee Record Not Deleted");  // Corrected message
//        }

		int n = employeeDao.update(employee.getEid(), employee.getEsalary());
		if(n == 1) {
			System.out.println("Employee Record Updated");
			}else {
				System.out.println("Employee Record Not Updated");
			}
}
}