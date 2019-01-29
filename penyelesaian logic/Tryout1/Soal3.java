package Tryout1;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal3 extends MyMatrix {
	
	public void setMatrix(int n, int n2, int n3) {
		// TODO Auto-generated method stub
		this.baris = n2*2-1;
		this.kolom = (n + (n2-1))*n3;
		this.matrix = new String[this.baris][this.kolom];
	
		
		int addBlock = 0;
		int index2 = 30;
		for(int block = 0; block < n3; block++) {
			int index  = 0;
			int index3 = -n2+1;
			for(int bangun = 0; bangun < n2*2-1; bangun++) {
				int a = 0;
				for (int i = 0; i < 1; i++) {
					for (int j = 0; j < n; j++) {
						
						if(bangun <= n2-1) {
							this.matrix[i+bangun][(n - j - 1)+(n2-1)-bangun + addBlock] = index + "";
						} else{
							//this.matrix[i+bangun][(n - j - 1)+(n2-1)-bangun + addBlock] = index + "";
							this.matrix[i+bangun][(n - j - 1)+index3+ addBlock] =  index + "";
						}
						index = index + 2;
						index2 = index2 + 2;
					} 
				}
				index3 = index3 + 1;
			}
			
			addBlock = addBlock + (n + (n2-1));
		}
		
		
	}
	
	public static void main(String[] args) {
		Soal3 jawab = new Soal3();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n, 5, 3);
		jawab.show();
	}

}
