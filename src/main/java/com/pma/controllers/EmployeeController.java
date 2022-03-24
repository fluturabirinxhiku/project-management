package com.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pma.models.Employee;
import com.pma.repositories.EmployeeRepository;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;

	@GetMapping("/new")
	public String getEmployeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "new-employee";
	}
	
	@PostMapping("/save")
	public String createProject(Employee employee) {
		employeeRepo.save(employee);
		
		return "redirect:/employees/new";
	}
	
}
