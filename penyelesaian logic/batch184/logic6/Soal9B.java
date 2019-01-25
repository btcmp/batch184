package com.xsis.training.batch184.logic6;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal9B extends MyMatrix {
	

	public int getMaxColumn(int n) {
		int result = 0;
		for(int i = 0; i < n; i++) {
			result = result + 3 + i;
		}
		return result;
	}
	
	public int[] getRS(int n) {
		int[] data = new int[n];
		int result = 0;
		data[0] = 0;
		int index  = 0; 
		for(int i = 1; i < n; i++) {
			result = result + 3 + index;
			data[i] = result;
			index++;
		}
		return data;
	}
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getRS(n)));
		
		this.baris = (3) + (n-1);
		this.kolom = getMaxColumn(n);
		this.matrix = new String[this.baris][this.kolom];
		int[] geserJ = getRS(n);
		
		int addBangun = 0;
		int index = 1;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < 3 + bangun; i++) {
				int nilai = (geserJ[bangun] + 1);
				for (int j = 0; j < 3 + bangun; j++) {
					if(i+j == 3 + bangun - 1 || j == 3 + bangun - 1 || i == 3 + bangun - 1) {
						this.matrix[i+((n-1)-bangun)][j+geserJ[bangun]] = nilai + "";
					}
					nilai++;
				}
			}
			addBangun = addBangun + 3;
			index++;
		}
//		for (int i = 0; i < 3+0; i++) {
//			for (int j = 0; j < 3; j++) {
//				this.matrix[i+2][j] = "*";
//			}
//		}
//		for (int i = 0; i < 3+1; i++) {
//			for (int j = 0; j < 3+1; j++) {
//				this.matrix[i+2-1][j+3] = "#";
//			}
//		}
//		for (int i = 0; i < 3+2; i++) {
//			for (int j = 0; j < 3+2; j++) {
//				this.matrix[i+2-2][j+7] = "$";
//			}
//		}
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
