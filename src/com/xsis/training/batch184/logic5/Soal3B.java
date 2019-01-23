package com.xsis.training.batch184.logic5;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal3B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = DeretAngka.getLastTriAngluar(n);
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
		//int[] bil1 = {1,2,3,4};
		//int[] bil2 = {1,3,5,7};
		//int[] bil3 = {0,1,2,3};
		int[] bil4 = DeretAngka.getTriAngluar(n);//{0,1,3,6};
		int[] bil5 = DeretAngka.getPangkat(n);//{0,1,4,9};
		int addBangun = 1;
		int addGanjil = 1;
		for(int bangun =0; bangun < n; bangun++) {
			//int pangkat = bangun * bangun; //0*0,1*1,2*2,3*3
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addGanjil; j++) {
					if(i+j >= bangun && j - i <= bangun) {
						this.matrix[i + bil4[bangun]][j+bil5[bangun]] = "*";
					}
				}
			}
			addBangun = addBangun + 1;
			addGanjil = addGanjil + 2;
		}
		
		
//		for (int i = 0; i < bil1[0]; i++) {
//			for (int j = 0; j < bil2[0]; j++) {
//				if(i+j >= 0 && j - i <= 0) {
//					this.matrix[i+0][j+0] = "*";
//				}
//				
//			}
//		}
//		for (int i = 0; i < bil1[1]; i++) {
//			for (int j = 0; j < bil2[1]; j++) {
//				if(i+j >= 1 && j - i <= 1) {
//					this.matrix[i+1][j+1] = "*";
//				}
//				
//			}
//		}
//		for (int i = 0; i < bil1[2]; i++) {
//			for (int j = 0; j < bil2[2]; j++) {
//				if(i+j >= 2 && j - i <= 2) {
//					this.matrix[i+3][j+4] = "*";
//				}
//				
//			}
//		}
		
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
