package com.xsis.training.batch184.logic2;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal9 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) { // as parameter
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		
		//context baris
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			int p = 1;
			for (int j = 0; j < this.kolom; j++) {
				
				this.matrix[i][j] = p + "";
				
				if(j < this.kolom / 2) {
					p = p + 2;
				} else {
					p = p - 2;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Soal9 jawab = new Soal9();
		Scanner scan = new Scanner(System.in);
		System.out.print("input argument >> ");
		int n = scan.nextInt(); //as argument
		
		jawab.setMatrix(n);
		jawab.show();
	}
}
