package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.bean.Book;
import com.cts.bean.Employee;
import com.cts.bean.Question;
import com.cts.config.AppConfig;

// Annotation Based Configurations

public class MainClass6 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Question question = (Question) context.getBean("question2");//By name
        System.out.println(question);
        
        Book book = (Book) context.getBean("book");
        System.out.println(book);

	}

}
