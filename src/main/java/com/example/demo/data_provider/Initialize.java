package com.example.demo.data_provider;

import com.example.demo.models.Project;
import com.example.demo.models.ToDoMain;

import java.util.ArrayList;

public class Initialize {

    private static Initialize initialize;
    private static ArrayList<Project> projects;


    public Initialize() {
        projects = new ArrayList<>();
        initialize();

    }

    public static Initialize getInstance() {
        if (initialize == null) {
            initialize = new Initialize();
        }
        return initialize;
    }

    public void initialize() {
        projects.add(new Project("Project PlayGround"));
        projects.add(new Project("Database"));
        projects.add(new Project("Requirements & Testing"));
        projects.add(new Project("Web Application"));

        ToDoMain toDoMain = new ToDoMain("web application assignments");
        projects.get(0).getToDoMains().add(toDoMain);
        projects.get(0).getToDoMains().add(new ToDoMain("Web application building"));
        projects.get(0).getToDoMains().add(new ToDoMain("Web application Documentation"));
        projects.get(0).getToDoMains().add(new ToDoMain("Web application submission"));


    }

    public ArrayList<Project> getProjects() {
        return projects;
    }


    /**
     * delete the caretaker from the list
     */

    public static void delete(int id) {
        projects.removeIf(project -> project.getId() == id);
    }
}

