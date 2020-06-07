package com.example.demo.models;

import java.util.Date;

public class ToDoSub {
    private static int id = 0;
    String name;
    Date dateCreated, dateModified, dateDone;
    boolean done;


    public ToDoSub(String name) {
        this.name = name;
        this.dateCreated = new Date();
        this.done = false;
        id++;
    }

    public static int getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateDone() {
        return dateDone;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public String getName() {
        return name;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setName(String name) {
        this.name = name;
    }
}

