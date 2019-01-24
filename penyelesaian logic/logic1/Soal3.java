package com.xsis.training.batch184.logic1;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal3 extends MyMatrix {//logic
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n; 
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				//AND (yang) and OR (atau)
				
				//1. if => and 
				if((i == j || i+j == this.kolom - 1) && i >= this.baris / 2) {
					this.matrix[i][j] = "#";
				} else if(j == this.kolom / 2) {
					this.matrix[i][j] = "&";
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Soal3 jawab = new Soal3();
		jawab.setMatrix(9);
		jawab.show();
	}
}
