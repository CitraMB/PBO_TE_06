package pboW3;

import java.util.Scanner;

public class Soal_1 {

	public static void main(String[] args) {
		//masukkan perintah java scanner
		Scanner in = new Scanner (System.in);
		String kata = in.nextLine();
		//mengubah string menjadi karakter array
		char[] karakter = kata.toCharArray();
		int k = 0, i = 0; //variabel untuk menghitung kata
		//looping
		while ( i < kata.length()) {
			if (((karakter[i] >= 'A') && (karakter[i] <= 'Z')) || ((karakter[i] >= 'a') && (karakter[i] <= 'z'))) {
				i++; //menambah indeks array
			}else {
				k++; //menambah jika bukan alfabet
				i++; //menambah indkes array
			}
		}
		System.out.println(k+1);
		//looping
		for (i = 0 ; i < kata.length() ; i++) {
			if (((karakter[i] >= 'A') && (karakter[i] <= 'Z')) || ((karakter[i] >= 'a') && (karakter[i] <= 'z'))) {
				System.out.print(karakter[i]);
			}else {
				//jika bukan alfabet
				System.out.print("\n");
			}
		}
	}

}