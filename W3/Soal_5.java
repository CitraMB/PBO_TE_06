package pboW3;

import java.util.Scanner;

public class Soal_5 
{
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
	
	//membuat inputan 4 plat nomer
		String Plat1 = scan.next();
		String Plat2 = scan.next();
		String Plat3 = scan.next();
		String Plat4 = scan.next();
	//menggabungkan string plat nomor agar tidak ada spasi
		String gabung = Plat1 + Plat2 + Plat3 + Plat4;
		
	//mengganti string dengan tipe long lalu dikurangi 999999
	//setelah itu di moduluskan dengan 5
		long hitung = ((Long.parseLong(gabung)) - 999999) % 5 ;
		if ( hitung == 0 ) {
	//jika hasil modulus sama dengan nol
			System.out.println("Berhenti");
		}else {
	//jika hasil modulus bukan nol
			System.out.println("Jalan");
		}
		
	}
}

