package com.xsis.training.batch184.logic1;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2 extends MyMatrix{
	
	//logic soal 1
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//isi
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i + j == this.kolom - 1) {
					this.matrix[i][j] = i + "." + j;
				}
			}
		}
	}

	public static void main(String[] args) {
		Soal2 jawab = new Soal2();
		jawab.setMatrix(5);
		jawab.show();
	}
}
