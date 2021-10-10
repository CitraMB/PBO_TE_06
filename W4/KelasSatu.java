package pboW4;

class KelasSatu
{
	// ketiga teroutput karena berada diluar dari static
	// dan public
	{
		System.out.println(11);
	}

	// kedua teroutput karena berbentuk static atau
	// lebih diutamakan
	static{
		System.out.println(2);
	}
	
	// tidak bisa dioutput kan karena saat dipanggil
	// tidak mengirim parameter apapun
	// terouput ketika ada parameter yang dimasukkan
	public KelasSatu(int i){
		// yang di outputkan adalah 3 bukan nilai i = 10
		System.out.println(3);
	}
	
	// keempat teroutput
	public KelasSatu(){
		System.out.println(4);
	}
	
}