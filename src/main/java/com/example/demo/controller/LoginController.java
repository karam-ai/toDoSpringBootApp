package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm() {
        return "login";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ModelAndView login(HttpSecurity http) throws Exception {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth.isAuthenticated()) {
//            return new ModelAndView("home");
//        } else {
//            return new ModelAndView("home");
//        }
//    }


}

