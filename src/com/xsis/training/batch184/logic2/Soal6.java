package com.xsis.training.batch184.logic2;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal6 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//context baris
		int p2 = n * 2 - 2;
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			int p = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= this.kolom - 1) {
					this.matrix[i][j] = p2 + "";
				}
			}
			p2 = p2 - 2;
		}
	}

	public static void main(String[] args) {
		Soal6 jawab = new Soal6();
		jawab.setMatrix(9);
		jawab.show();
	}
}
