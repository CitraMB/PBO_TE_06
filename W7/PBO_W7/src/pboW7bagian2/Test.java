package pboW7bagian2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle s1 = new Circle();
		
		System.out.println("Keliling :" + s1.getArea() + ", Luas :" + s1.getPerimeter());
		System.out.println(s1.toString() + "\n");
		
		Rectangle s2 = new Rectangle();
		
		System.out.println("Keliling :" + s2.getArea() + ", Luas :" + s2.getPerimeter());
		System.out.println(s2.toString() + "\n");
		
		Square s3 = new Square();
		
		System.out.println("Keliling :" + s3.getArea() + ", Luas :" + s3.getPerimeter());
		System.out.println(s3.toString());
		
	}

}
