package com.example.demo.controller;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServlet;

@Controller
public class MainController extends HttpServlet {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String index(AuthenticationManagerBuilder auth) throws Exception {
//        SpringBootSecurityConfiguration springBootSecurityConfiguration = new SpringBootSecurityConfiguration();
//        springBootSecurityConfiguration.users.add(new User("hello", "world"));
//        auths.inMemoryAuthentication()
//                .withUser("hello").password("{noop}" + "world").roles("USER");

        return "home";
    }


    /*
    @RequestMapping({"/"})
    String index(HttpSession session) {
        session.setAttribute("mySessionAttribute", "someValue");
        return "index";
    }
     */
}
