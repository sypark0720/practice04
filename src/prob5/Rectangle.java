package prob5;

public class Rectangle extends Shape implements Resizable {
	//field
	private double width;
	private double height;
	//constructor
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}
	//
	@Override
	public double getArea() {
		return width*height;
	}
	@Override
	public double getPerimeter() {
		return (width+height)*2;
	}
	@Override
	public void resize(double rate) {
		width = width * rate ;
		height = height*rate;
	}
}
