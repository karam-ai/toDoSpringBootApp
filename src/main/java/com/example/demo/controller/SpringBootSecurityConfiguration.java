package com.example.demo.controller;

import com.example.demo.models.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(99)
public class SpringBootSecurityConfiguration extends WebSecurityConfigurerAdapter {
    ArrayList<User> users = new ArrayList<>();

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        users.add(new User("karam", "karam"));
        users.add(new User("qarsum", "qarsum"));
        users.add(new User("admin", "admin"));
        users.add(new User("mooza", "mooza"));

        for (User user : users) {
            auth.inMemoryAuthentication()
                    .withUser(user.getUsername()).password("{noop}" + user.getPassword()).roles("USER");
        }
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests().antMatchers("/resources/**", "/registration", "/about").permitAll()
                .antMatchers("/**").hasAnyRole("USER")
                .and()
                .formLogin().loginPage("/login").permitAll();
//https://stackoverflow.com/questions/41827388/spring-security-keeps-redirecting-me-to-login-page
//        http.formLogin().successHandler(new AuthenticationSuccessHandler() {
//            @Override
//            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                //do nothing
//            }
//        });


    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationForm() {
        return "registration";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public void registration(HttpSecurity http, AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("hi").password("{noop}" + "hi").roles("USER");
        //return "login";
    }
}