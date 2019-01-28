package com.xsis.training.batch184.teory;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		User user = new User("user1234", "didit", "slslsl", "xxxx", "didit@yahoo.com", null);
		User user1 = new User("user12342", "didit2", "slslsl2", "xxxx", "didit2@yahoo.com", null);
		User user2 = new User("user12343", "didit3", "slslsl3", "xxxx", "didit3@yahoo.com", null);
		
		
		//	user.username = "sdf";
		user2.setEmail("custome@gmail.com");
		System.out.println("username : "+ user2.getEmail());
		
		User user3 = new User();
		user3.setUsername("alfitra");
		user3.setPassword("honocoroko");
		System.out.println("username : "+ user3.getUsername());
		
		EmployeeX employee = new EmployeeX();
		employee.setEmail("tsani@gmail.com");
		System.out.println("email : "+ employee.getEmail());
	}
}
