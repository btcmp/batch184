package com.xsis.training.batch184.logic4;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class KelasKebalik2 extends MyMatrix {

	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n*2-1;
		int[] data = DeretAngka.getFibonachi(n);
		String[] myChar = DeretKarakter.getKarakter();
		
		this.matrix = new String[this.baris][this.kolom];
		for (int i = 0; i < this.baris; i++) {
			int p = 0;	
			for (int j = 0; j < this.kolom; j++) {
				if(i == j || i+j == this.baris-1) {
					this.matrix[i][j] = ""+ data[j];
					this.matrix[i][this.kolom - j - 1] = this.matrix[i][j];
				} else if(i == this.baris /2 && j <= this.kolom /2) {
					this.matrix[i][j] = ""+ myChar[p++];
					this.matrix[i][this.kolom - j - 1] = this.matrix[i][j];
				}
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		KelasKebalik2 kelasBalis = new KelasKebalik2();
		kelasBalis.setMatrix(9);
		kelasBalis.show();
		
	}
}
