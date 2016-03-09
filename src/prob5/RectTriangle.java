package prob5;

public class RectTriangle extends Shape {
	//field 
	private double width;
	private double height;
	
	//constructor
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height/2;
	}

	@Override
	public double getPerimeter() {
		return width+height+(Math.sqrt(height*height+width*width));
	}
}
