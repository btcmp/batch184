package com.xsis.training.batch184.teory;

//employee
//manager
//director
//admin
//operator

class Employee{
	String emplooyeeId;
	String firstName;
	String lastName;
	String email;
	double salary;
	
	public double getSalary() {
		return this.salary;
	}
	
	public void info() {
		System.out.println("name : "+ this.firstName);
		System.out.println("email : "+ this.email);
		System.out.println("salary : "+ getSalary());
	}
}

class Manager extends Employee{
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + 20000;
	}
}

class Director extends Manager{
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + 20000;
	}
}

class Admin extends Employee{
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}
}

class Operator extends Employee{
	
}


public class MyInhiritance {
	public static void main(String[] args) {
		Employee employee = new Employee();
			employee.firstName = "ujang";
			employee.salary = 3000;
			employee.info();
			
		Employee manager = new Manager(); //polymorphism
			manager.firstName = "danang";
			manager.salary = 3000;
			manager.info();
			
		Employee director = new Director();
			director.firstName = "Latif";
			director.salary = 3000;
			director.info();
		
		Operator opera = new Operator();
			opera.firstName = "oper";
			opera.salary = 3000;
			opera.info();
			
		//contoh casting 
		int abc = 555555555;
		short db = (short) abc;
		System.out.println("hasil casting :  "+ db);
	}
}
