package com.gervkuete.mappers;

import java.util.List;

import com.gervkuete.model.Employee;

public interface EmployeeMapper {

	void createEmployee(Employee employee);
	List<Employee> getAllEmployees();
	void updateEmployee(Employee employee);
	void deleteEmployee(int id);
}
