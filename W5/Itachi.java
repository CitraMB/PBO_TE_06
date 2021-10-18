package pboW5;

public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}

	//mengubah sedikit nama nya agar tidak sama dengan
	//function di class Sasuke
	void printfDojutsu() {
		//mengeluarkan Dojutsu di super class
		System.out.println(super.Dojutsu);
		//mengubah isi dari Dojutsu
		setDojutsu();
		System.out.println(this.Dojutsu);
	}

	//mengubah nya dari private agar bisa terbaca
	void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}	
}