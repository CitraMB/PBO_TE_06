package pboW7bagian2;

public class Square extends Rectangle{
	
	public Square () {
		super();
	}
	
	public Square (double side) {
		super (side, side);
	}
	
	public Square (double side, String color, boolean filled) {
		
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide (double side) {

	}
	
	public void setWidth (double side) {
		getWidth();
	}
	
	public void setLength (double side) {
		getLength();
	}
	
	@Override
	public String toString() {
		return "Square [Rectangle [Shape [color =" + super.getColor() + 
				", filled =" + super.isFilled() + "], width =" + 
				super.getWidth() + ", length =" + super.getLength() + "]]";
	}
	
	@Override
	public double getArea () {
		return 4*super.getWidth();
	}
	
	@Override
	public double getPerimeter () {
		return super.getWidth()*super.getLength();
	}
}
