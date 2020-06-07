package com.example.demo.models;

import java.io.Serializable;

public class User implements Serializable {

    private static long id = 0;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        id++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}