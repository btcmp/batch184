package com.xsis.training.batch184.logic1;

public class Soal1B {

	//deklarasi variable
	int baris = 0;
	int kolom = 0;
	String[][] matrix= null; //new String[?][?];
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
	
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i + j >= this.baris - 1) {
					this.matrix[i][j] = "*";
				} 
			}
		}
	}

	
	public void showMatrix() {
		for(int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
			//	if(this.matrix[i][j] != null) {
					System.out.print(this.matrix[i][j]+"\t");
			//	} else {
				//	System.out.print("");
			//	}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal1B jawab = new Soal1B();
		jawab.setMatrix(5);
		jawab.showMatrix();
	}
}

/*
 1. kirim n
 2. set matrix array
 	* baris 
 	* kolom
 	* array 2D
 3. tampilkan pola matrix
 */
