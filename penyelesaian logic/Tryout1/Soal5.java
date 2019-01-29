package Tryout1;

import java.util.Arrays;
import java.util.Scanner;

import com.xsis.training.batch184.logic4.DeretKarakter;
import com.xsis.training.batch184.utils.DeretAngka;
import com.xsis.training.batch184.utils.MyMatrix;

public class Soal5 extends MyMatrix {
	
	@Override
	public void setMatrix(int n) {
		// TODO Auto-generated method stub
		this.baris = DeretAngka.getLastTriAngluar(n);
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
		int[] bil4 = DeretAngka.getTriAngluar(n);//{0,1,3,6};
		int[] bil5 = DeretAngka.getPangkat(n);//{0,1,4,9};
		String[] dataF = DeretKarakter.getKarakter();
		int[] dataFib = DeretAngka.getFibonachi(n*n);
		
		System.out.println(Arrays.toString(dataF));
		
		int addBangun = 1;
		int addGanjil = 1;
		
		for(int bangun =0; bangun < n; bangun++) {
			int index = 0;
			for (int i = 0; i < addBangun; i++) {
				for (int j = 0; j < addGanjil; j++) {
					if(i+j >= bangun && j - i <= bangun) {
						if(bangun % 2 == 0) {
							this.matrix[i + bil4[bangun]][j+(n-addBangun)] = dataFib[index] + "";
						} else {
							this.matrix[i + bil4[bangun]][j+(n-addBangun)] = dataF[index] + "";
						}
					
						index++;
					}
				}
			}
			addBangun = addBangun + 1;
			addGanjil = addGanjil + 2;
		}
	}
	
	public static void main(String[] args) {
		Soal5 jawab = new Soal5();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai >> ");
		int n = input.nextInt();
		System.out.print("Masukkan nilai 2 >> ");
		int n2 = input.nextInt();
		jawab.setMatrix(n);
		
		if(n2 == 1) 
			jawab.showLeft();
		else 
			jawab.show();
	}

}
