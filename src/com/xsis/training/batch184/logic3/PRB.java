package com.xsis.training.batch184.logic3;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.logic4.DeretKarakter;
import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class PRB extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka.getFibonachi(n);
		String[] dataChar = DeretKarakter.getKarakter();
		System.out.println(Arrays.toString(dataFib));
		System.out.println(Arrays.toString(dataChar));
	
		for (int i = 0; i < this.baris; i++) {
			int index = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i-j == 0 || i+j == this.baris-1) {
					this.matrix[i][j] = dataFib[j] +"";
					//mirror
					this.matrix[i][this.kolom-j-1] = this.matrix[i][j]+"";
					
				} else if(i == this.baris / 2 && j <= this.baris - 1) {
					this.matrix[i][j] = dataChar[index++] + "";
					//mirror
					this.matrix[i][this.kolom-j-1] = this.matrix[i][j]+"";
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		PRB jawab = new PRB();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
