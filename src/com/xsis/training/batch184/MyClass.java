package com.xsis.training.batch184;

public class MyClass {

	//deklarasi variable
    String username="anggi";
	int age=21;
	double salary=50000.0;
	
	public int getAge() {
		return 21;
	}
	
	public String getStatus() {
		if(this.age > 20) {
			return "dewasa";
		}
		return "masih kecil";
	}
	
	
	public void info() {
		String username = "lohan";
		System.out.println("i am "+ getAge());
		System.out.println("hallo "+ this.username);
		System.out.println("salary : "+ this.salary);
		System.out.println("status : "+ this.getStatus());
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//instansiasi / instance //getInstance
		MyClass myClass=new MyClass();
		myClass.info();
	}
}
