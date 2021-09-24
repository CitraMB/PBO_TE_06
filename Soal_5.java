package pboW2;

public class Soal_5 
{
	public static void main(String[] args) {
		String A = "citra";
		String B = "budiman";
		int panjang = ( A.length() + B.length()); //menambahkan panjang A dan B
		System.out.println("panjang = " + panjang);
		int Satukan = A.compareTo(B); //menyatukan dua string
		if (Satukan > 0) {
			System.out.println("No");
		} else if (Satukan < 0) {
			System.out.println("No");
		} else if (Satukan == 0) {
			System.out.println("Yes");
		}
		//membesarkan satu huruf depan dari kata
		String C = (A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
		System.out.println(C);
	}
}
