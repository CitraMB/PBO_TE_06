package pboW3;

import java.util.Scanner;

public class Soal_4 
{
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner (System.in);
		int Terjual = scan.nextInt();
		
		//jika terjual lebih dari sama dengan 40
		if (( Terjual >= 40 ) && ( Terjual <= 80 )) {
			int Gaji = (( 25 * ( Terjual * 50000 )) / 100) + 500000 ; //25%
			System.out.println(Gaji);
		}else if ( Terjual > 80 ) { //jika terjual lebih dari 80
			int Gaji = (( 35 * ( Terjual * 50000 )) / 100) + 500000 ; //35%
			System.out.println(Gaji);
		}else if ( Terjual <= 15 ) { //jika terjual kurang sama dengan 15
			int Gaji = 500000 - (( 15 * 500000) / 100) + (( 10 * ( Terjual * 50000)) / 100) - 2500 ; 
			System.out.println(Gaji); //pemotongan 15% gaji pokok, ditambah 10% penjualan
		}else { //jika terjual lebih dari 15 dan kurang dari 40
			int Gaji = (10 * ( Terjual * 50000 ) / 100) + 500000 ; //10%
			System.out.println(Gaji);
		}
	}
}
