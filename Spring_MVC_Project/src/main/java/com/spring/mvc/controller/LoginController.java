package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.mvc.bean.Login;

@Controller
public class LoginController {

    @RequestMapping("login")  // Changed from "loginForm" to "login"
    public ModelAndView loadLoginForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LoginForm");  
        return mv;
    }

    @RequestMapping("processLogin")
    public ModelAndView processLogin(@ModelAttribute("login") Login login) { 
        ModelAndView mv = new ModelAndView();
        
        String username = login.getUsername();
        String password = login.getPassword();

        if ("Admin".equals(username) && "123".equals(password)) {  
            mv.setViewName("LoginSuccess");
            mv.addObject("username", username);
        } else {
            mv.setViewName("LoginFail");
            mv.addObject("errorMessage", "Invalid Username or Password");
        }

        return mv;
    }
}
