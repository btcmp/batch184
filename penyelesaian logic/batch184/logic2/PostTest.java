package com.xsis.training.batch184.logic2;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class PostTest extends MyMatrix {
	
	@Override
	public void setMatrix(int n) { // as parameter
		// TODO Auto-generated method stub
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int[] fib = DeretAngka.getFibonachi(n);
		System.out.println(Arrays.toString(fib));
		
		//context baris
		for (int i = 0; i < this.baris; i++) {
			//context kolom
			for (int j = 0; j < this.kolom; j++) {
				if(j == this.kolom /2) {
					this.matrix[i][j] = fib[i] + "";
				} else if(i == j && i >= this.baris /2) {
					this.matrix[i][j] = fib[i] + "";
				} else if(i + j == this.kolom - 1 && i >= this.baris /2) {
					this.matrix[i][j] = fib[i] + "";
				}
				
			}
		}
	}

	public static void main(String[] args) {
		PostTest jawab = new PostTest();
		Scanner scan = new Scanner(System.in);
		System.out.print("input argument >> ");
		int n = scan.nextInt(); //as argument
		
		jawab.setMatrix(n);
		jawab.show();
	}
}
