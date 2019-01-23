package com.xsis.training.batch184.logic2;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal3 extends MyMatrix {
	
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
			int p2 = 1;
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = p2 + "";
				} else if(i+j == this.kolom -1 ) {
					this.matrix[i][j] = p + "";
				} 
				p = p + 2;
				p2 = p2 + 2;
			}
			k = k + 2;
			predict = predict - 2;
		}
	}

	public static void main(String[] args) {
		Soal3 jawab = new Soal3();
		jawab.setMatrix(9);
		jawab.show();
	}
}
