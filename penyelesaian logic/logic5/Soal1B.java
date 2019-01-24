package com.xsis.training.batch184.logic5;

import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal1B extends MyMatrix {
	
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
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addBangun; j++) {
					this.matrix[i+bil2[bangun]][(this.kolom - j - 1) - bil2[bangun]] = "*";
				}
			}
			
			addBangun = addBangun + 1;
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
