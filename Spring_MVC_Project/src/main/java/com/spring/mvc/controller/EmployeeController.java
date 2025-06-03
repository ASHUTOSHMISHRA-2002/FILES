package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.mvc.bean.Employee;

@Controller
public class EmployeeController {

    @RequestMapping("employee")
    public ModelAndView loadEmployeeForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("EmployeeForm"); //Calling the Input 
        return mv;
    }

    @RequestMapping("processEmployee")
    public ModelAndView processEmployee(@ModelAttribute("employee") Employee employee) { 
        ModelAndView mv = new ModelAndView();

        int eid = employee.getEid();
        String ename = employee.getEname();
        double esalary = employee.getEsalary();

        
//       mv.addObject("employee", employee);
        mv.setViewName("EmployeeRegistration"); //Calling the Result Page
        mv.addObject("eid", eid);
        mv.addObject("ename", ename);
        mv.addObject("esalary", esalary);

    
        return mv;
    }
}
