package com.xsis.training.batch184.logic5;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = DeretAngka.getLastTriAngluar(n);
		this.kolom = DeretAngka.getLastTriAngluar(n);
		this.matrix = new String[this.baris][this.kolom];
		
		//int[] bil1 = {1,2,3,4}; //ok
		int[] bil2 = DeretAngka.getTriAngluar(n+1);//{0,1,3,6,10};
		System.out.println(Arrays.toString(bil2));
		//int[] bil3 = {1,3,4,6};
		int addBangun = 1;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addBangun; j++) {
					this.matrix[i+bil2[bangun]][j + this.kolom-bil2[bangun+1]] = "*";
				}
			}	
			addBangun = addBangun + 1;
		}

//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 1; j++) {
//				this.matrix[i+0][j + this.kolom-1] = "*"; //10
//			}
//		}	
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				this.matrix[i+1][j + this.kolom-3] = "*"; //6
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				this.matrix[i+3][j + this.kolom-6] = "*"; //
//			}
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				this.matrix[i+6][j + this.kolom-10] = "*"; //
//			}
//		}

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
