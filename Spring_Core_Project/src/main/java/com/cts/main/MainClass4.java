package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.bean.Employee;
import com.cts.bean.Hello;
import com.cts.bean.Question;
import com.cts.config.AppConfig;

//Java Based Configuration
public class MainClass4 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.getMsg());
		
		Hello hello1 = (Hello) context.getBean("hello1");
		System.out.println(hello1.getMsg());
		
		Question question = (Question) context.getBean("question");
		System.out.println(question);
		
		Question question1 = (Question) context.getBean("question1");
		System.out.println(question1);
	
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}