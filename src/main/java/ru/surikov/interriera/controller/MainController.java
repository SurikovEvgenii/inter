package ru.surikov.interriera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.surikov.interriera.entity.Project;
import ru.surikov.interriera.service.ProjectRepositoryService;

import java.util.List;

@Controller("/")
public class MainController {

    @Autowired
    private ProjectRepositoryService projectRepositoryService;

    @GetMapping("/index")
    public String index(Model model) {
        List<Project> projectList = projectRepositoryService.findAll();
        model.addAttribute("projectList", projectList);
        return "index";
    }

    @GetMapping("/create")
    public String createGet(Model model) {
        model.addAttribute("project", new Project());
        return "create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute Project project) {
        Project project1 = new Project();
        project1.setName(project.getName());
        project1.setDescription(project.getDescription());
        System.out.println(project1.toString());;
        projectRepositoryService.save(project);
        return "redirect:/index";
    }
}
