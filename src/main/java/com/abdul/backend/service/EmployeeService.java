package com.abdul.backend.service;

import java.util.List;

import com.abdul.backend.model.Employee;

public interface EmployeeService {
	Employee savEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);

}
