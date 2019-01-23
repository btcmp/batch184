package com.xsis.training.batch184.logic1;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal8B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				//atas
				if(i <= j && i + j <= this.kolom - 1) {
					this.matrix[i][j] = "*";
				} 
				//bawah
				else if(i >= j && i + j >= this.kolom - 1) {
					this.matrix[i][j] = "*";
				}
				
			}
		} 
	}
	
	public static void main(String[] args) {
		Soal8B jawab = new Soal8B();
		jawab.setMatrix(9);
		jawab.show();
	}

}
