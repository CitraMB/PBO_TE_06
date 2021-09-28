package pboW2;

public class Soal_4 
{
	static short methodOne(long l)
	{
		int i = (int) l;
		System.out.println("i = " + i); //memeriksa perubahan dari long float ke int
		return (short)i;
	}
	
	public static void main(String[] args)
	{
		double d = 10.25;
		float f = (float) d;
		System.out.println("f = " + f); //memeriksa perubahan dari double ke float
		byte b = (byte) methodOne((long) f); //mengubah short menjadi byte
		System.out.println("b = " + b); 
	}
}