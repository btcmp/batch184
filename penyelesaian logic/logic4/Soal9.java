package com.xsis.training.batch184.logic4;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal9 extends MyMatrix {
	
	public void setMatrix(int n, int n2) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = (n*n2)-(n2-1);
		this.matrix = new String[this.baris][this.kolom];
		int[] ganjil = DeretAngka.getOdd(n);
		System.out.println(Arrays.toString(ganjil));
		
		int addBangun = 0;
		for(int bangun = 0; bangun < n2; bangun++) {
			for (int i = 0; i < this.baris; i++) {
				int index = 0;
				for (int j = 0; j < this.kolom; j++) {
					if(i+j >= this.baris /2 
							&& i - j <= this.baris /2 
							&& j - i <= this.baris /2
							&& j + i <= (this.baris - 1) + (this.baris/2)
							) {
						this.matrix[i][j+addBangun] = ganjil[index] + "";
						//copy
						//this.matrix[i][j+(this.baris-1)] = ganjil[index] + "";					
						if(j < this.baris / 2) {
							index++;
						} else {
							index--;
						}
					}
				}
			}
			
			addBangun = addBangun + (n-1);
		}
		
	}
	
	public static void main(String[] args) {
		Soal9 jawab = new Soal9();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		System.out.print("Masukkan nilai jumlah bangun >> ");
		int n2 = input.nextInt();
		
		jawab.setMatrix(n, n2);
		jawab.show();
	}

}
