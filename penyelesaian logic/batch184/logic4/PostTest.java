package com.xsis.training.batch184.logic4;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class PostTest extends MyMatrix{
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
	 this.baris = n;
	 this.kolom = n*2-1;
	 this.matrix = new String[this.baris][this.kolom];
	 int[] dataFib = DeretAngka.getFibonachi(n);
	 
	 for (int i = 0; i < this.baris; i++) {
		for (int j = 0; j < this.kolom; j++) {
			if(i == j) {
				this.matrix[i][j] = dataFib[i] + "";
				this.matrix[i][j+(n-1)] = dataFib[(this.baris - i - 1)] +"";
			} else if(i+j == this.baris - 1) {
				this.matrix[i][j] = dataFib[j] + "";
				this.matrix[i][j+(n-1)] = dataFib[((this.kolom/2) - j)] +"";
			} 
		}
	}
	}
	
	public static void main(String[] args) {
		PostTest pt = new PostTest();
		pt.setMatrix(9);
		pt.show();
	}

}
