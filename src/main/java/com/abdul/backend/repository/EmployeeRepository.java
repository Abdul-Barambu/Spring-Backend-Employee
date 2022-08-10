package com.abdul.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdul.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
