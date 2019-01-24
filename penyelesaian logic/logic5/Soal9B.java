package com.xsis.training.batch184.logic5;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal9B extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = DeretAngka.getLastTriAngluar(n);
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
		int[] bil4 = DeretAngka.getTriAngluar(n);//{0,1,3,6};
		int[] bil5 = DeretAngka.getPangkat(n);//{0,1,4,9};
		int addBangun = 1;
		int addGanjil = 1;
		
		for(int bangun =0; bangun < n; bangun++) {
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addGanjil; j++) {
					if(i+j >= bangun && j - i <= bangun) {
						this.matrix[i + bil4[bangun]][j+(n-addBangun)] = "*";
					}
				}
			}
			addBangun = addBangun + 1;
			addGanjil = addGanjil + 2;
		}
	}
	
	public static void main(String[] args) {
		Soal9B jawab = new Soal9B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
