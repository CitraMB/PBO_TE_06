package pboW5;

public class Restaurant {
	//data
	private String[] nama_makanan; //mengubah tipe
	private double[] harga_makanan; //mengubah tipe
	private int[] stok; //mengubah tipe
	public static byte id=0;

	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	// menambahkan menu makanan
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}

	// menampilkan menu makanan
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){ // mendeteksi stok 0 atau tidak
				System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
	}
	
	public boolean isOutOfStock(int id){
		if(stok[id] == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void nextId(){
		id++;
	}
}