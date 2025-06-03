package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean.Address;
import com.cts.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
		// 1.XML based configuration using Setter Injection
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
//		Employee employee = (Employee) context.getBean("employee");//in context.getBean() we need to pass the object which we have created
//		System.out.println(employee);
//
//		Employee employee1 = (Employee) context.getBean("employee1");
//		System.out.println(employee1);
//
//		Address address = (Address) context.getBean("address");//in context.getBean() we need to pass the object which we have created
//		System.out.println(address);
//
//		Address address1 = (Address) context.getBean("address1");
//		System.out.println(address1);
//		
//		address.setCity("Mumbai");
//		address1.setCity("Delhi");
//		System.out.println(address1);

		// 2.XML based configuration using constructor Injection

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		Employee employee = (Employee) context.getBean("employee");// in context/.getBean() we need to pass the object
																	// which we have created
		System.out.println(employee);

		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);

		Address address = (Address) context.getBean("address");// in context.getBean() we need to pass the object which
																// we have created
		System.out.println(address);

		Address address1 = (Address) context.getBean("address1");
		System.out.println(address1);

		address.setCity("Mumbai");
		address1.setCity("Delhi");
		System.out.println(address1);

	}
}