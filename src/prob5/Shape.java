package prob5;

abstract public class Shape {
	//field
	private int countSides;
	
	//constructor
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	//methods
	public abstract double getArea();
	public abstract double getPerimeter();
	
	//getter
	public int getCountSides() {
		return countSides;
	}
}
