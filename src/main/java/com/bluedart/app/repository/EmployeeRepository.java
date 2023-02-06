package com.bluedart.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.bluedart.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Transactional
	@Procedure(name = Employee.NamedQuery_getEmployee)
	  List<Employee> get_employee(String branch);
}
