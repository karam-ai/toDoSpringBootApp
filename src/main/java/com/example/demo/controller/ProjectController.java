package com.example.demo.controller;

import com.example.demo.data_provider.Initialize;
import com.example.demo.models.Project;
import com.example.demo.models.ToDoMain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("project")
public class ProjectController {
    private final Initialize management = Initialize.getInstance();
    Project project;

    @RequestMapping(value = "/{id}")
    public String getProject(@PathVariable Integer id, Model model) {
        for (Project project : management.getProjects()) {
            if (project.getId() == id) {
                this.project = project;
            }
        }
        model.addAttribute("project", project);
        model.addAttribute("todo", project.getToDoMains());
        return "project/project_overview";
    }


    /**
     * @get get new project form to use it to add new project
     */
    @RequestMapping(value = "/new_todo", method = RequestMethod.GET)
    public String newTodo(@ModelAttribute(name = "todo_name") ToDoMain toDoMain) {
        return "todo/new_todo";
    }

    /**
     * @POST Post new project form to use it to add new project
     */
    @RequestMapping(value = "/new_project", method = RequestMethod.POST)
    public String saveNewProject(@ModelAttribute(name = "project_name") Project project) {
        management.getProjects().add(project);
        return "redirect:/";
    }

    /**
     * @Get Post new project form to use it to add new project
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editProject(@PathVariable Integer id, Model model) {
        model.addAttribute("name", management.getProjects().get(id).getName());
        model.addAttribute("id", management.getProjects().get(id).getId());
        return "project/edit_project";
    }

    /**
     * @POST Post new project form to use it to add new project
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEditedProject(@ModelAttribute(name = "project_name") Project project_) {
        this.management.getProjects().get(this.project.getId()).setName(project_.getName());
        return "redirect:/";
    }

    /**
     * @Get remove a project by id
     */
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeProject(@PathVariable Integer id) {
        Initialize.delete(id);
        return "redirect:/";
    }


}
