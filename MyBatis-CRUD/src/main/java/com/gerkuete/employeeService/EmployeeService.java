package com.gerkuete.employeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gervkuete.mappers.EmployeeMapper;
import com.gervkuete.model.Employee;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	// Insert employee into db
	public void insertEmployee(Employee employee) {
		employeeMapper.createEmployee(employee);
	}
	
	// Retrieve all employees from db
	public List<Employee> getAllEmployees() {
		return employeeMapper.getAllEmployees();
		
	}
	//  Update employee
	public void updateEmployee(Employee employee) {
		employeeMapper.updateEmployee(employee);
	}
	
	// Delete employee
	public void deleteEmployee(Integer id) {
		employeeMapper.deleteEmployee(id);
	}

}
