package com.mycom.maven.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.maven.model.Employee;
import com.mycom.maven.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeSer;

	@PostMapping("/add")
	public Employee addEmployee(Employee employee) {
		employeeSer.addEmployee();
		return employee;
	}
	
	
	/*
	@PostMapping("/add")
	public ModelAndView save(@ModelAttribute Employee employee) throws ClassNotFoundException, SQLException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.getView();
		modelAndView.setViewName("list.jsp");  // userdata.html
		
		// userdata.html with thymeleaf template
		
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
	*/

}
