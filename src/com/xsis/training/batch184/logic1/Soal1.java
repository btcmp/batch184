package com.xsis.training.batch184.logic1;

public class Soal1 {
	
	int baris = 0;
	int kolom = 0;
	
	public void logic(int n) {
		this.baris = n;
		this.kolom = n;
		System.out.println("baris : "+ this.baris);
		System.out.println("kolom : "+ this.kolom);
		System.out.println("======= logic =======");
		for(int i = 0; i < this.baris; i++) {
			for(int j = 0; j < this.kolom; j++) {
				//if(i == j) {
					System.out.print(i + "." +j+ "\t");
				//} 
				//else {
					//System.out.print("null\t");
				//}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		jawab.logic(5);
	}

}
