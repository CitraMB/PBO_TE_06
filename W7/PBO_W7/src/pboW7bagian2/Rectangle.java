package pboW7bagian2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle () {
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle (double width, double length) {
		
	}
	
	public Rectangle (double width, double length, String color, boolean filled) {
		
	}
	
	public double getWidth () {
		return width;
	}
	
	public void setWidth (double width) {
		this.width = width;
	}
	
	public double getLength () {
		return length;
	}
	
	public void setLength (double length) {
		this.length = length;
	}
	
	//keliling persegi panjang
	public double getArea () {
		return (2*width)+(2*length);
	}
	
	//luas persegi panjang
	public double getPerimeter () {
		return width*length;
	}
	
	@Override
	public String toString () {
		return "Rectangle [Shape [color =" + super.getColor() + ", filled =" + super.isFilled()
		+ "], width =" + width + ", length =" + length + "]";
	}
}