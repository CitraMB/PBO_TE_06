package pboW8_7_2;
//o6 - o9
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload obj = new Overload();
		double result;
		
		// menampilkan modul demo dengan satu argumen integer
		obj.demo(10);
		// menampilkan modul demo dengan dua argumen integer
		obj.demo(10, 20);
		
		// karena bentu modul bukan void, maka akan mereturnkan angka
		// return angka tersebut akan masuk ke dalam variabel result
		result = obj.demo(5.5);
		System.out.println("O/P :" + result);
	}

}
