package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;

public class ToDoMain {
    private static int id = 0;
    String name;
    Date dateCreated, dateModified, dateClosed;
    boolean done;


    public ToDoMain(String name) {
        this.name = name;
        this.dateCreated = new Date();
        this.done = false;
        id++;
    }


    public String getStatus() {
        if (this.done) {
            return "Done";
        } else {
            return "In Progress";
        }
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

    public Date getDateClosed() {
        return dateClosed;
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

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
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

