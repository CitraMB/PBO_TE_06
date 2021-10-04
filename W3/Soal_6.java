package pboW3;

//import Scanner
import java.util.Scanner;
//import Big Integer
import java.math.BigInteger;

public class Soal_6 
{
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		//mengambil dua angka BigInteger dari keyboard
		BigInteger Angka1 = scan.nextBigInteger();
		BigInteger Angka2 = scan.nextBigInteger();
		
		//untuk penambahan tipe BigInteger menggunakan add
		BigInteger tambah = Angka1.add(Angka2);
		//untuk perkalian tipe BigInteger menggunakan multiply
		BigInteger kali = Angka1.multiply(Angka2);
		System.out.println(tambah);
		System.out.println(kali);
	}

}
