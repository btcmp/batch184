package com.xsis.training.batch184.teory;

import java.util.Arrays;

public class MyArray {
	
	//deklarasi variable
	String username = "aldi";
	String[] cities = new String[4];
	
	public void example() {
		this.username = "dini";
		this.cities[0] = "jakarta timur";
		this.cities[1] = "jakarta barat";
		this.cities[2] = "jakarta selatan";
		this.cities[3] = "jakarta utara";
		
		System.out.println("username : "+ this.username);
		//manual
		System.out.println(this.cities[0]);
		System.out.println(this.cities[3]);
		
		//ouput string dengan bantuan class Arrays
		System.out.println(Arrays.toString(this.cities));
		
		//looping
		for(int i = 0; i < this.cities.length; i++) {
			if(!this.cities[i].equals("jakarta barat")) {
					System.out.println("city : "+ this.cities[i]);
			}
		}
		
		//foreach
		for(String res: this.cities) {
			System.out.println("kota : "+ res);
		}
		
		//multi Array -> matrix
		String[][] data = new String[3][2];
		
		System.out.println("//array=========");
		//manual
		data[0][0] = "a";
		data[0][1] = "b";
		
		//data[1][0] = "a";
		//data[1][1] = "b";
		
		data[2][0] = "a";
		data[2][1] = "b";
		
		//make matrix data
		for (int i = 0; i < data.length ; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		MyArray ma = new MyArray();
		ma.example();
	}
}
