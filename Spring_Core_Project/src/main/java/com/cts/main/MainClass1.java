package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.bean.Hello;

public class MainClass1 {
	
	//Example for Spring Bean Scope
	
	public static void main(String[] args) {
	
		//Singleton Scope
		/* It creates only one object for the bean class every time you call getBean() it only returns  the same object
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");

		Hello hello1 = (Hello) context.getBean("hello");
		System.out.println(hello1.hashCode());
		System.out.println(hello1.getMsg());// Hello Sphinx
		hello1.setMsg("Hail Sphinx");//Due to the singleton bean scope it will reflect to hello2 also
		
		Hello hello2 = (Hello) context.getBean("hello");
		System.out.println(hello2.hashCode());
		System.out.println(hello2.getMsg());// Hail Sphinx
       */
		
		//Prototype Scope
		//It creates new object for the bean class every time you call getBean() it returns a new instance
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");

		Hello hello1 = (Hello) context.getBean("hello");
		System.out.println(hello1.hashCode());
		System.out.println(hello1.getMsg());// Hello Sphinx
		hello1.setMsg("Hail Sphinx");
		System.out.println(hello1.getMsg());//Hail Sphinx
		
		Hello hello2 = (Hello) context.getBean("hello");
		System.out.println(hello2.hashCode());
		System.out.println(hello2.getMsg());// Hello Sphinx
	}

}
