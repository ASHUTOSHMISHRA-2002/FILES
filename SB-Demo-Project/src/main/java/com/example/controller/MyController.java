package com.example.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

import lombok.extern.slf4j.Slf4j;

@RestController //@Controller + @ResponseBody 
@Slf4j
public class MyController {
	
	private Logger log = LoggerFactory.getLogger(MyController.class);
	
	//GetMapping For Fetching Data 
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome to SPRING BOOT APPLICATION";
	}
	
	@GetMapping("/hello/{ename}")
	public String sayHello(@PathVariable("ename")String ename) {
		log.info("User accessing SayHello() method");
		log.warn("Test Warning: ");
		try {
			int a = 10/0;
		}catch(ArithmeticException e) {
			log.error("Arithmetic Exception Raised");
		}
		return "Hello "+ename;
	}
	
	//Not A Ideal Way
//	@GetMapping("/hello/{eid}/{ename}/{esalary}")
//	public String sayHello(@PathVariable("eid")int eid ,@PathVariable("ename")String ename,@PathVariable("esalary")int esalary) {
//		return "Hello "+eid+" Aka "+ename+" Getting Salary "+esalary ;
//	}
	
	//Post Mapping For Creating
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		//insert query
		return employee;
	}
	
}
