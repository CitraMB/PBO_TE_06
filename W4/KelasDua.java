package pboW4;

class KelasDua
{
	// tidak teroutput karena sistem langsung masuk
	// ke main nya dan tidak ada yang memanggil
	// class KelasDua
	{
		System.out.println(5);
	}

	public static void main(String[] args){
		// teroutput pertama kali
		System.out.println(6);
		
		// perintah untuk mengeluarkan ketiga output
		KelasSatu satu = new KelasSatu();
		// memanggil kembali dengan nilai int i = 10
		KelasSatu dua = new KelasSatu(10);
	}
}