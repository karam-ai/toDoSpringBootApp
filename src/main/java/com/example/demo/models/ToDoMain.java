package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;

public class ToDoMain {private static int id = 0;
    String name;
    Date dateCreated, dateModified, dateDone;
    boolean done;
    ArrayList<ToDoSub> toDoSubs;


    public ToDoMain(String name) {
        this.name = name;
        this.dateCreated = new Date();
        this.done = false;
        id++;
        this.toDoSubs = new ArrayList<>();
    }

    public ArrayList<ToDoSub> getToDoSubs() {
        return toDoSubs;
    }

    public void setToDoSubs(ArrayList<ToDoSub> toDoSubs) {
        this.toDoSubs = toDoSubs;
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

