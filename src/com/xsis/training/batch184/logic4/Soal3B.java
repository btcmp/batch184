package com.xsis.training.batch184.logic4;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal3B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
	
		for (int i = 0; i < this.baris; i++) {
			int index = 1;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= this.kolom/2 && j -i <= this.kolom/2 && i <= this.baris /2) {
					this.matrix[i][j] = "" + index++;
					//mirror
					this.matrix[this.baris - i - 1][j] = this.matrix[i][j];
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal3B jawab = new Soal3B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
