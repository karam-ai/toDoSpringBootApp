package com.example.demo.models;

import java.util.ArrayList;

public class Project {
    private static int lastId = 0;
    private int id;
    String name;
    boolean closed;
    int count;
    ArrayList<ToDoMain> toDoMains;


    public Project(String name) {
        this.toDoMains = new ArrayList<>();
        this.closed = false;
        this.name = name;
        id = lastId++;
    }

    public int getId() {
        return this.id;
    }

    public int countOpenTodo() {
        int num = 0;
        for (ToDoMain toDoMain : this.toDoMains) {
            if (!toDoMain.done) {
                num++;
            }
        }
        return num;
    }

    public String getStatus() {
        if (this.isClosed()) {
            return "Done";
        } else {
            return "in Progress";
        }
    }

    public int getCountToDo() {
        return this.getToDoMains().size();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ToDoMain> getToDoMains() {
        this.count = toDoMains.size();
        return toDoMains;
    }


    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void setToDoMains(ArrayList<ToDoMain> toDoMains) {
        this.toDoMains = toDoMains;
        this.count = toDoMains.size();
    }


    @Override
    public String toString() {
        StringBuilder a = new StringBuilder("");
        a.append("project details" +
                "getName=" + this.getName() +
                "isClosed=" + this.isClosed() +
                "getCountToDo=" + this.getCountToDo() +
                "list of Projects");
        if (toDoMains != null) {
            for (ToDoMain todo : toDoMains) {
                a.append(todo.toString()).append("\n");
            }

        }
        return a.toString();
    }

}
