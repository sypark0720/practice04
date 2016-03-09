package prob5;

public class ShapeTest {

	public static void main(String[] args) {

//		ii.	만일 해당 Shape가 Resizable 하다면, 0.5 만큼 resize한 후 new area와 new perimeter를 출력합니다.
//
//		area: 30.0
//		perimeter: 22.0
//		new area: 7.5
//		new perimeter: 11.0
//		area: 6.0
//		perimeter: 14.32455532033676
		
		Rectangle rectangle1 = new Rectangle(5,6);
		RectTriangle rectTriangle1 = new RectTriangle(6,2);
		
		Shape[] ShapeArray = new Shape[2];
		ShapeArray[0] = rectangle1;
		ShapeArray[1] = rectTriangle1;
		
		for (int i=0; i<ShapeArray.length; i++){	
			System.out.println("area: "+ ShapeArray[i].getArea());
			System.out.println("perimeter: "+ShapeArray[i].getPerimeter());
			if (ShapeArray[i] instanceof Resizable){
				Rectangle rectangle2 = (Rectangle)ShapeArray[i];
				rectangle2.resize(0.5);
				System.out.println("new area: "+ ShapeArray[i].getArea());
				System.out.println("new perimeter: "+ShapeArray[i].getPerimeter());				
		}
		
		
		
		}
		
		
		


	}

}
