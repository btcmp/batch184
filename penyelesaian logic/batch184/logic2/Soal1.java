package com.xsis.training.batch184.logic2;

import java.util.Arrays;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal1 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int[] ganjil = DeretAngka.getOdd(n);
		System.out.println(Arrays.toString(ganjil));
		
		//context baris
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = ganjil[j] + "";
				}
			}
		}
	}

	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		jawab.setMatrix(9);
		jawab.show();
	}
}
