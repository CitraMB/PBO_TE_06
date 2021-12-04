package pboW8_7_1;

public class Horse extends Animal{


	@Override
	public void sound () {
		System.out.println("Neigh");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// menampilkan sound dari class Horse
		// hal itu dikarenakan pengimplementasian polymorph
		// yaitu dynamic polumorphism yang dinyatakan oleh overriding
		Animal obj = new Horse();
		obj.sound();
	}

}
