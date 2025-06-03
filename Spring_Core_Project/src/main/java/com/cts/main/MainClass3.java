package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean.Book;
import com.cts.bean.Question;

//Injection Map Collection

public class MainClass3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		Book book1 = (Book) context.getBean("book1");
		System.out.println(book1);
		
		Book book2 = (Book) context.getBean("book2");
		System.out.println(book2);
	}
}
