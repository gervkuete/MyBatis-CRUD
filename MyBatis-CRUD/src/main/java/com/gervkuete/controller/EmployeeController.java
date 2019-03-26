package com.gervkuete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gervkuete.employeeService.EmployeeService;
import com.gervkuete.model.Employee;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/loadEmployees")
	public List<Employee> showListOfEmployees() {
		System.out.println("Inside get");
		System.out.println(employeeService.getAllEmployees());
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam("id") Integer id) {
		employeeService.deleteEmployee(id);
		//return employeeService.getAllEmployees();
	}
	

}
