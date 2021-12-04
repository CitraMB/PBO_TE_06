package pboW8_7_1;

public class Cat extends Animal{

	@Override
	public void sound () {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hal serupa juga terjadi di class ini
		// karena pendeklarasian new nya adalah subclass
		// maka overriding nya akan mengambil dari subclass
		Animal obj = new Cat();
		obj.sound();
	}

}
