package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean.Question;

//Injection List Collection

public class MainClass2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");
		Question question1 = (Question) context.getBean("question1");
		System.out.println(question1);
		
		Question question2 = (Question) context.getBean("question2");
		System.out.println(question2);
	}
}
