package com.cts.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cts.bean.Address;
import com.cts.bean.Book;
import com.cts.bean.Employee;
import com.cts.bean.Hello;
import com.cts.bean.Question;

//Java Based Configuration 
@Configuration
@ComponentScan(basePackages = "com.cts")
public class AppConfig {

	@Bean(name = "hello")
	@Scope("singleton")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("Hello Java Config");
		return hello;
	}

	@Bean(name = "hello1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Hello getHello1() {
		Hello hello = new Hello();
		hello.setMsg("Hello Valan");
		return hello;
	}

	@Bean(name = "question")
	public Question getQuestion() {
		Question question = new Question(101, "What is the capitital of India",
				Arrays.asList("Delhi", "Chennai", "Bangalore", "Hyderabad"));
		return question;
	}

	@Bean(name = "question1")
	public Question getQuestion1() {
		Question question = new Question();
		question.setQid(102);
		question.setQuestion("Which one is not oops language?");
		question.setAnswers(Arrays.asList("C", "C++", "Java", "Python"));
		return question;
	}

	@Bean(name = "address1")
	public Address getAddress1() {
		Address address = new Address();
		address.setCity("Chennai");
		address.setState("Tamil Nadu");
		return address;
	}

	@Bean(name = "address2")
	public Address getAddress2() {
		Address address = new Address();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		return address;
	}

	// @Bean(name = "employee",autowire=Autowire.BY_NAME)
	@Bean(name = "employee")
	public Employee getEmployee() {
		// Employee employee = new Employee(101, "Valan", 2000.0,getAddress1());
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Valan");
		employee.setSalary(2000.0);
		employee.setAddress(getAddress1());
		return employee;
	}

	@Bean(name = "employee1", autowire = Autowire.BY_TYPE)
	public Employee getEmployee1() {
		Employee employee = new Employee(102, "Vijay", 3000.0, getAddress1());

		return employee;
	}

	@Bean("answers")
	public List<String> getAnswers() {
		return Arrays.asList("Delhi", "Mumbai", "Banglore", "Bhubaneswar");
	}

	@Bean("question2")
	public Question getQuestion2() {
		return new Question(101, "What is the capital of Odisha", getAnswers());
	}
	
	@Bean("map")
	public Map<String,String> getMap(){
		Map<String,String> map = new HashMap<>();
		map.put("Throry Of Everything ","Stephen Hawking");
		map.put("Hailday Resnik","Coloumbous");
		map.put("Power Of Subconcious mind","Galilio");
		map.put("Maths","Sphinx");
		return map;
	}
	
	@Bean("book")
	public Book getBook() {
		return new Book(101, getMap());
	}

}
