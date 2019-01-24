package com.xsis.training.batch184.logic2;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal4 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//context baris
		int p2 = 1;
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			int p = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = p2 + "";
				} 
				else if(j == this.kolom /2) {
					this.matrix[i][j] = p2 + "";
				}
				else if(i+j == this.kolom -1 ) {
					this.matrix[i][j] = p + "";
				}  else if(i == this.baris / 2) {
					this.matrix[i][j] = p + "";
				}
				p = p + 2;
			}
			
			p2 = p2 + 2;
		}
	}

	public static void main(String[] args) {
		Soal4 jawab = new Soal4();
		jawab.setMatrix(9);
		jawab.show();
	}
}
