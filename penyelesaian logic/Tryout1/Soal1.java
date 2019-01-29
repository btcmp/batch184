package Tryout1;

import java.util.Scanner;

import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal1 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = (n*2-1)+(n*2);
		this.kolom = (n*2-1)+(n*2);
		this.matrix = new String[this.baris][this.kolom];
		int data3Fib[] = DeretAngka.get3bonachi(n*n);
		int dataFib[] = DeretAngka.getFibonachi(n*n);
	
		int index  = 1;
		int index2 = ((n*n)*2)*2-1;
		int index3 = 0;
		int index4 = 0;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				//this.matrix[i][j] = "*";
				//segitiga atas && bawah
				if(j + i >= this.kolom /2 && i <= n - 1 && j - i <= this.kolom /2) {
					this.matrix[i][j] = index + "";
					this.matrix[this.baris - i - 1][this.kolom - j - 1] =  index2 + "";
					
					index = index + 2;
					index2 = index2 - 2;
				} 
				//segitiga kiri && segitiga kanan
				else if(i+j >= this.baris / 2 && j <= n - 1 && i - j <= this.baris /2) {
					this.matrix[i][j] = index3 + "";
					
					index3++;
				} else if(j - i <= this.kolom/2 && i + j <= (this.baris - 1) + this.baris / 2 && j >= this.kolom - n) {
					this.matrix[i][j] = data3Fib[index4++] + "";
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.showClear();
	}

}
