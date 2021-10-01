package pboW3;

import java.util.Scanner; //

public class Soal_2 
{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//mengambil 3 string dan 3 angka
		String Alfa1 = in.next();
		int Angka1 = in.nextInt();
		String Alfa2 = in.next();
		int Angka2 = in.nextInt();
		String Alfa3 = in.next();
		int Angka3 = in.nextInt();
		
		//membuat pagar
		for (int i = 0 ; i < 25 ; i++) {
			System.out.print("=");
		}

		//memberikan output string dan angka pertama
		System.out.print("\n" + Alfa1.toLowerCase());
		int j = 15;
		int k = j - Alfa1.length(); 
		while (k > 0) {
			System.out.print(" "); //agar rapih
			k = k - 1;
		}
		if (Angka1 < 10) { //penambahan nol di angka
			System.out.print("00" + Angka1);
		}else if (Angka1 < 100) {
			System.out.print("0" + Angka1);
		}else if (Angka1 <= 999) {
			System.out.print(Angka1);
		}
		
		//memberikan output string dan angka kedua
		System.out.print("\n" + Alfa2.toLowerCase());
		j = 15;
		k = j - Alfa2.length();
		while (k > 0) {
			System.out.print(" "); //agar rapih
			k = k - 1;
		}
		if (Angka2 < 10) { //penambahan nol di angka
			System.out.print("00" + Angka2);
		}else if (Angka2 < 100) {
			System.out.print("0" + Angka2);
		}else if (Angka2 <= 999) {
			System.out.print(Angka2);
		}
		
		//memberikan output string dan angka ketiga 
		System.out.print("\n" + Alfa3.toLowerCase());
		j = 15;
		k = j - Alfa3.length();
		while (k > 0) {
			System.out.print(" "); //agar rapih
			k = k - 1;
		}
		if (Angka3 < 10) { //penambahan nol di angka
			System.out.print("00" + Angka3);
		}else if (Angka3 < 100) {
			System.out.print("0" + Angka3);
		}else if (Angka3 <= 999) {
			System.out.print(Angka3);
		}
		
		//pembuatan pagar
		System.out.print("\n");
		for (int i = 0 ; i < 25 ; i++) {
			System.out.print("=");
		}
	}
}
