package com.xsis.training.batch184.logic6;

import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n*n;
		this.kolom = (n*2-1)*2;
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka.getFibonachi(n*n);
		int addBangun = 0;
		
		for(int bangun = 0; bangun < n; bangun++) {
			int index = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < (n*2-1); j++) {
					if(i + j >= (n-1) && j - i <= (n-1)) {
						if(bangun % 2 == 0) {
							this.matrix[i+addBangun][j] = dataFib[index] + "";
							index++;
						} else {
							this.matrix[i+addBangun][j+(n*2-1)] = dataFib[index] + "";
							index++;
						}
					}
				}
			}
			addBangun = addBangun + n;
		}
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i + j >= 2 && j - i <= 2) {
//					this.matrix[i][j] = "*";
//				}
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i + j >= 2 && j - i <= 2) {
//					this.matrix[i+3][j] = "*";
//				}
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
