package com.xsis.training.batch184.logic4;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal1B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
	
		int[] increment = DeretAngka.getIncrement(n*2);
		System.out.println(Arrays.toString(increment));
		
		for (int i = 0; i < this.baris; i++) {
			int index = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= this.kolom/2 && j - i <= this.kolom/2) {
					this.matrix[i][j] = "" + increment[index];
					index++;
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		Soal1B jawab = new Soal1B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
