package com.xsis.training.batch184.logic1;

public class Soal1C {
	
	int baris = 0;
	int kolom = 0;
	String[][] matrix = null;
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = "*";
				}
			}
		}
	}
	
	public void showMatrix() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				System.out.print(this.matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal1C jawab = new Soal1C();
		jawab.setMatrix(9);
		jawab.showMatrix();
	}

}
