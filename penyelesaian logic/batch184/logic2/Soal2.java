package com.xsis.training.batch184.logic2;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//context baris
		int k = 1;
		int predict = n * 2 - 2;
		
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			int p = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j == this.kolom -1 ) {
					this.matrix[i][j] = p + "";
				}
				p = p + 2;
			}
			k = k + 2;
			predict = predict - 2;
		}
	}

	public static void main(String[] args) {
		Soal2 jawab = new Soal2();
		jawab.setMatrix(9);
		jawab.show();
	}
}
