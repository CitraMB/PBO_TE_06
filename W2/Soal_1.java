package pboW2

//import java scanner
import java.util.Scanner;

public class Soal_1 
{
	public static void main(String[] args) {
		//masukkan perintah java scanner
		Scanner in = new Scanner (System.in);
		for (;;) { //pengulangan
			//mengambil angka dari keyboard menggunakan range yang lebih besar dari long
			double i = in.nextDouble(); 
			String j = ((i > -9223372036854775808L) & (i < 9223372036854775807L))? "can be fitted in:" : "Can't be fitted anywhere";
			System.out.println(j);
			//membuktikan byte
			if ((i > -128) & (i < 127)) {
				System.out.print("* Byte");
			}
			//membuktikan short
			if ((i > -32768) & (i < 32767)) {
				System.out.print("\n* Short");
			}
			//membuktikan int
			if ((i > -2147483648) & (i < 2147483647)) {
				System.out.print("\n* Int");
			}
			//membuktikan long
			if ((i > -9223372036854775808L) & (i < 9223372036854775807L)) {
				System.out.print("\n* Long");
			}
			System.out.println();
		}
	}
}
