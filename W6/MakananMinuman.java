package pboW6;

public class MakananMinuman extends Barang {
	
	private int tglEx;
	
	void profilBarang (String nama, int stok, int tglEx){
		this.tglEx = tglEx;
		BarangUmum (nama, stok);
	}
		
	void Tampil () {
		System.out.println("Nama makanan : " + super.nama);
		System.out.println("Stok         : " + super.stok);
		System.out.println("Tanggal Exp  : " + this.tglEx);
	}
	
}
