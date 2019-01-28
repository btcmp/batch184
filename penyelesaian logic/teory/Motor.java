package com.xsis.training.batch184.teory;

public class Motor {
	
	//create constructor
	public Motor(){
		System.out.println("constructor motor executed!!");
	}
	
	//overloading constructor
	public Motor(double p){
		this.price = p;
	}
	
	//overloading constructor
	public Motor(String p) {
		this.type = p;
	}
	
	//overloading constructor
	public Motor(String p, double q) {
		this.type = p;
		this.price = q;
	}

	String merk;
	String type;
	int cc;
	String platNomer;
	double price;
	
	//get price
	public double getPrice() {
		return this.price;
	}
	
	//overload
	public double getPrice(double m) {
		this.price = m;
		return this.price;
	}
	
	
	public static void main(String[] args) {
		Motor motor = new Motor("NINJA R", 40000); //instansiasi object
		motor.merk = "kawasaki ninja";
		
		System.out.println("merk : " + motor.merk);
		System.out.println("price : "+ motor.getPrice(50000));
		System.out.println("type : "+ motor.type);
	}
}
