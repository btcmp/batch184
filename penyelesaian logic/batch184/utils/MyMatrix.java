package com.xsis.training.batch184.utils;

public class MyMatrix {
	
	public int baris = 0;
	public int kolom = 0;
	public String[][] matrix = null;
	
	//default logic
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
	
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "*";
			}
		}
	}
	
	public void show() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				System.out.print(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
