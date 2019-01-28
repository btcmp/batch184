package com.xsis.training.batch184.teory;

// POJO / JAVABEANS
public class EmployeeX {

	private String employeeXId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	public EmployeeX() {}
	
	public EmployeeX(String employeeXId, String firstName, String lastName, String email, double salary) {
		super();
		this.employeeXId = employeeXId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}

	public String getEmployeeXId() {
		return employeeXId;
	}

	public void setEmployeeXId(String employeeXId) {
		this.employeeXId = employeeXId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
}
