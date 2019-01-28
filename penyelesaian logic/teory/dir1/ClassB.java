package com.xsis.training.batch184.teory.dir1;

public class ClassB extends ClassA{
	
	public void getInhiritance() {
		//System.out.println(this.privateString);
		System.out.println(this.defaultString);
		System.out.println(this.protectedString);
		System.out.println(this.publicString);
	}
	
	//via instance
	public void getInstance() {
		ClassA ca = new ClassA();
		//System.out.println(ca.privateString);
		System.out.println(ca.defaultString);
		System.out.println(ca.protectedString);
		System.out.println(ca.publicString);
	}
}
