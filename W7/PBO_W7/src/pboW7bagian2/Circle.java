package pboW7bagian2;

public class Circle extends Shape{
	private double radius;
	
	public Circle () {
		radius = 1.0;
	}
	
	public Circle (double radius) {
		
	}
	
	public Circle (double radius, String color, boolean filled) {
		
	}
	
	public double getRadius () {
		return radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	//luas lingkaran
	public double getArea () {
		return radius*radius*Math.PI;
	}
	
	//keliling lingkaran
	public double getPerimeter () {
		return 2*radius*Math.PI;
	}
	
	@Override
	public String toString () {
		return "Circle [Shape [color =" + super.getColor() + ", filled =" + 
				super.isFilled() + "], radius =" + radius + "]";
	}
}