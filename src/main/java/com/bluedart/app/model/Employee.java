package com.bluedart.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
/*
@SqlResultSetMapping(name = "EmployeeMapping", 
			classes = { 
					@ConstructorResult(targetClass = Employee.class, 
			columns = {
						@ColumnResult(name = "id", type = Long.class), 
						@ColumnResult(name = "name", type = String.class), 
						@ColumnResult(name = "branch", type = String.class),
						@ColumnResult(name = "salary", type = Double.class), 
						}) 
			})
@NamedNativeQuery(name = "Employee.get_employee", 
			query = "{ call get_employee(:input, :output_cursor) }", 
			resultSetMapping = "EmployeeMapping")
*/
@NamedStoredProcedureQuery(
	      name = Employee.NamedQuery_getEmployee,
	      procedureName = "get_employee",
	      resultClasses = Employee.class,
	      parameters = {
	              @StoredProcedureParameter(type = String.class, mode = ParameterMode.IN),
	              @StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR)	      }
	)
@Entity
public class Employee {
	public static final String NamedQuery_getEmployee = "getAllEmployee";
	
	@Id
	private Long id;

	private String name;
	private String branch;
	private Double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String branch, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.salary = salary;
	}
	
	public Employee(String name, String branch, Double salary) {
		super();
		this.name = name;
		this.branch = branch;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	 
}
