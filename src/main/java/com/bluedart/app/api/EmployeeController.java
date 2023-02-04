package com.bluedart.app.api;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluedart.app.model.Employee;
import com.bluedart.app.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	@GetMapping("/api/employee/get")
	public List<Employee> getAllEmployee(){
		return employeeRepository.get_employee("mumbai");
	}
}
