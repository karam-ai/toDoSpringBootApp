package com.example.demo.models;

import java.util.Date;

public class LoginForm {
    private String username;
    private String password;
    private Date birthday;
    private String email;




    public LoginForm(String username, String password, Date birthday, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return this.username + this.email + this.birthday;
    }


}
