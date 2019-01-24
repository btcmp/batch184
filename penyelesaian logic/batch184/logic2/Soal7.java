package com.xsis.training.batch184.logic2;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal7 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//context baris
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			int p = 1;
			int p2 = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = p + "";
				} else if(i + j == this.kolom - 1) {
					this.matrix[i][j] = p2 + "";
				} else if(j >= i && i + j <= this.kolom - 1) {
					this.matrix[i][j] = "A";
				} else if(i + j >= this.kolom - 1 && i >= j) {
					this.matrix[i][j] = "B";
				}
				
				p = p + 2;
				p2 = p2 + 2;
			}
		}
	}

	public static void main(String[] args) {
		Soal7 jawab = new Soal7();
		jawab.setMatrix(9);
		jawab.show();
	}
}
