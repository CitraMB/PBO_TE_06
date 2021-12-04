package pboW8_7_2;

public class Overload {
	// Overloading adalah beberapa constructor memilliki
	// nama yang sama. namun berbeda-beda argumennya
	
	void demo (int a){
		System.out.println("a :" + a);
	}
	
	void demo (int a, int b) {
		System.out.println("a and b :" + a + "," + b);
	}
	
	double demo (double a) {
		System.out.println("double a :" + a);
		return a*a;
	}
}
