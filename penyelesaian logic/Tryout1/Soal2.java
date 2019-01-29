package Tryout1;

import java.util.Scanner;

import com.xsis.training.batch184.utils.MyMatrix;

public class Soal2 extends MyMatrix {
	
	public int getMaxColumn(int n) {
		int result = -2;
			for (int i = 0; i < n; i++) {
				result = result + 2;
			}
		return result;
	}
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		//System.out.println();
		
		this.baris = 3 + getMaxColumn(n); //(0/2/4/6)
		this.kolom = 3 + (getMaxColumn(n)*2);
		this.matrix = new String[this.baris][this.kolom];
	
		int index = n*2+1;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				//bagian atas
				if(i <= j && i % 2 == 0 && j <= this.kolom / 2 ) {
					this.matrix[i][j] = index + "";
					this.matrix[i][this.kolom - j - 1] = this.matrix[i][j];
				}
				//bagian bawah
				else if(i >= j && j % 2 == 0 && j <= this.kolom / 2) {
					this.matrix[i][j] = index + "";
					this.matrix[i][this.kolom - j - 1] = this.matrix[i][j];
				}
				
			}
			index--;
		}
	}
	
	public static void main(String[] args) {
		Soal2 jawab = new Soal2();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		jawab.setMatrix(n);
		jawab.show();
	}

}
