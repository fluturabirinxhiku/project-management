package com.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pma.models.Project;
import com.pma.repositories.ProjectRepository;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository projectRepo;

	@GetMapping("/new")
	public String getProjectForm(Model model) {
		model.addAttribute("project",new Project());
		return "new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project) {
		projectRepo.save(project);
		
		return "redirect:/projects/new";
	}
}
