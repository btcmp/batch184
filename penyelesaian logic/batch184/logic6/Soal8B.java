package com.xsis.training.batch184.logic6;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal8B extends MyMatrix {
	
	public int countStart(int n) {
		int result = 0;
		int index  = 1;
		int desc = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				result = index - desc;
				desc++;
			}
			index++;
		}
		return result;
		/* example: 
		 n = 5, result : 3
		 loop : 
		 index = 1,desc = 0 => 1 - 0 = 1
		 index = 3,desc = 1 => 3 - 1 = 2
		 index = 5,desc = 2 => 5 - 2 = 3
		 * */
	}
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		
		//System.out.println("n : "+ n + ", start : "+ start);
		this.baris = (n)*n;
		this.kolom = (n)*n;
		this.matrix = new String[this.baris][this.kolom];
		int addBangun = 0;
		int addBangun2 = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < n; i++) {
				int start = countStart(n) + addBangun2; //0+3+6
				for (int j = 0; j < n; j++) {
					if(i + j >= (n-1)/2 
							&& j - i <= (n-1)/2 
							&& i - j <= (n-1)/2 
							&& i + j <= (n-1) + (n-1)/2) {
						
						if(j <= n/2) {
							this.matrix[i+addBangun][j+addBangun] = (start--) + "";
							//mirror
							this.matrix[i+addBangun][(n-j-1)+addBangun] = 
															this.matrix[i+addBangun][j+addBangun] + "";
						}
					
					}
				}
			}
			addBangun = addBangun + n;
			addBangun2 = addBangun2 + countStart(n);
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
		Soal8B jawab = new Soal8B();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
