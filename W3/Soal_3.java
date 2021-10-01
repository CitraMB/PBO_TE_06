package pboW3;

import java.util.Scanner;//import scanner

public class Soal_3 
{
	private static Scanner scan; //nama scanner scan

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		int Angka1 = scan.nextInt();
		char Operasi = scan.next().charAt(0); //mengambil input berupa char
		int Angka2 = scan.nextInt();
		
		if ( Operasi == '+') { //membandingkan operasi dengan +
			int hasil = Angka1 + Angka2;
			System.out.println(hasil);
		}else if ( Operasi == '-') { //membandingkan operasi dengan -
			int hasil = Angka1 - Angka2;
			System.out.println(hasil);
		}else if ( Operasi == '*') { //membandingkan operasi dengan *
			int hasil = Angka1 * Angka2;
			System.out.println(hasil);
		}else if ( Operasi == '/') { //membandingkan operasi dengan /
			int hasil = Angka1 / Angka2;
			System.out.println(hasil);
		}else if ( Operasi == '%') { //membandingkan operasi dengan %
			int hasil = Angka1 % Angka2;
			System.out.println(hasil);
		}
	}
}
