package com.xsis.training.batch184.logic6;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class example4for extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n*n;
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
	
		int addBlock = 0;
		for(int block = 0; block < n; block++) {
			int addBangun = 0;
			for(int bangun = 0; bangun < n; bangun++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if(i >= j) {
							if(block == bangun) {
								this.matrix[i+addBlock][j+addBangun] = "*";
							} else if(block == 0) {
								this.matrix[i+addBlock][j+addBangun] = "*";
							}
							
						}
					}
				}
				addBangun = addBangun + n;
			}
			addBlock = addBlock + n;
		}
		
		
	}
	
	public static void main(String[] args) {
		example4for jawab = new example4for();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
