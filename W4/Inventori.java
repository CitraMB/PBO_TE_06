package pboW4;

import java.math.*;
import java.util.Scanner;

public class Inventori {
	private static Scanner scan;
	Barang[] barangs; //mendeklarasikan class barang menjadi barangs

	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}

	void showBarang(BigDecimal k) {
		System.out.println(barangs[0].nama_barang + "(" + k + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].stok + ")");
	}
	
	void pengadaan() {
		initBarang(); //memanggil modul initBarang

		System.out.println("Masukkan jumlah penambahan stock ke baju : ");
		//penggunaan big decimal agar hanya bisa melakukan operasi penambahan saja
		BigDecimal i = scan.nextBigDecimal();
		//mengubah stok barang menjadi tipe BigDecimal
		BigDecimal j = new BigDecimal (barangs[0].stok);
		//penambahan dalam bentuk BigDecimal adalah memakai add
		BigDecimal k = j.add(i);

		showBarang(k); //menampilkan modul showBarang
	}
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Inventori beli = new Inventori();
		beli.pengadaan(); //menampilkan modul pengadaan
	}
}
