package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.bean.Calculator;

@Controller
public class CalculatorController {

	@RequestMapping("calculator")
	public ModelAndView loadCalculatorForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalculatorInput");

		return mv;
	}

	@RequestMapping("do_calculate")
	public ModelAndView doCalculate(@ModelAttribute("Calculator") Calculator calculator) { // Binding model attribute
		ModelAndView mv = new ModelAndView();

		// Business Logic
		int a = calculator.getN1();// Binding the values to target page
		int b = calculator.getN2();

		String operation = calculator.getOperation();
		int result = 0;

		if (operation.equals("Addition")) {
			result = a + b;
		} else if (operation.equals("Subtraction")) {
			result = a - b;
		} else if (operation.equals("Multiplication")) {
			result = a * b;
		} else {
			result = a / b;
		}
		mv.setViewName("CalculatorResult");
		mv.addObject("input1", a);
		mv.addObject("input2", b);
		mv.addObject("operation", operation);
		mv.addObject("result", result); // Setting the attributes values
		return mv;
	}
}
