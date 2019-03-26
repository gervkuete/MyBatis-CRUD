package com.gervkuete.employeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gervkuete.mappers.EmployeeMapper;
import com.gervkuete.model.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public void insertEmployee(Employee employee) {
		employeeMapper.createEmployee(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeMapper.getAllEmployees();	
	}

	public void updateEmployee(Employee employee) {
		employeeMapper.updateEmployee(employee);
	}
	
	public void deleteEmployee(Integer id) {
		employeeMapper.deleteEmployee(id);
	}

}
