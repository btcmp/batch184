package com.xsis.training.batch184.logic4;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
	
		for (int i = 0; i < this.baris; i++) {
			int index  = 1;
			for (int j = 0; j < this.kolom; j++) {
				if(i - j <= 0 && i+j <= this.kolom - 1 ) {
					this.matrix[i][j] = "" + index++;
				} 
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal2B jawab = new Soal2B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
