package com.xsis.training.batch184.logic5;

import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal18B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = DeretAngka.getLastTriAngluar(n);
		this.kolom = DeretAngka.getLastTriAngluar(n);
		
		this.matrix = new String[this.baris][this.kolom];
		//int[] bil1 = {1,2,3,4}; //ok
		int[] bil2 = DeretAngka.getTriAngluar(n); //{0,1,3,6};
		
		//looping object
		int addBangun = 1;
		int cGanjil = 1;
		int cGenap = 2;
		
		for(int bangun = 0; bangun < n; bangun++) {
			
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addBangun; j++) {
					if(bangun % 2 == 0) {
						if(i % 2 == 0) {
							this.matrix[i+bil2[bangun]][j+ bil2[bangun]] = cGanjil +"";
						} else {
							this.matrix[i+bil2[bangun]][(addBangun - j - 1)+ bil2[bangun]] = cGanjil + "";
						}
						cGanjil = cGanjil + 2;
					} else {
						if(i % 2 == 0) {
							this.matrix[i+bil2[bangun]][j+ bil2[bangun]] = cGenap +"";
						} else {
							this.matrix[i+bil2[bangun]][(addBangun - j - 1)+ bil2[bangun]] = cGenap + "";
						}
						cGenap = cGenap + 2;
					}
				}
			}
			
			addBangun = addBangun + 1;
		}

	}
	
	public static void main(String[] args) {
		Soal18B jawab = new Soal18B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
