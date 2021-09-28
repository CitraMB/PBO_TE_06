package pboW2;

public class Soal_2 
{
	public static void main(String[] args) {
		//pendeklarasian CM_PER_INCH nya didalam modul dan masih bisa diubah
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}

public class Soal_2 {
	//pendeklarasian CM_PER_INCH nya di luar modul sehingga mutlak dan tidak dapat diubah
	public static final double CM_PER_INCH = 2.54;
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}