package com.xsis.training.batch184.logic4;

import com.xsis.training.batch184.utils.MyMatrix;

public class KelasKebalik extends MyMatrix {

	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int p = 0;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= this.baris /2 && j - i <= this.kolom/2 && i <= this.baris / 2) {
					this.matrix[i][j] = ""+p++;
					//mirroring
					this.matrix[this.baris-i-1][j] = this.matrix[i][j];
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		KelasKebalik kelasBalis = new KelasKebalik();
		kelasBalis.setMatrix(9);
		kelasBalis.show();
		
	}
}
