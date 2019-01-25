package com.xsis.training.batch184.logic6;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal10B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
	
		int kiri = 1;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i >= j && i % 2 == 0) {
					this.matrix[i][j] = kiri +"";
				} else if(i+j >= this.kolom - 1 && i % 2 == 1) {
					this.matrix[i][j] = kiri +"";	
				}
			}
			kiri++;
		}
	}
	
	public static void main(String[] args) {
		Soal10B jawab = new Soal10B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
