
public class main03 {

	public static void main(String[] args) {
		
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));	//Shape shape = new Circle(10);
		System.out.println();
		sr.readShape(new Square(10, 20));//Shape shape = new Square(10,20);
		System.out.println();
		sr.readShape(new Triangle(10, 20));
		
		//추상 클래스는 자식 클래스에 의해서만 메모리 할당을 받을 수 있다.
		Shape s = new Circle(10);
		
		//sr.readShape(new Shape());
		
//		sr.readShape(new Shape());
//		
//		Shape shape = new Shape();
//		
//		Circle circle = (Circle)shape;
//		Square square = (Square)shape;
		
	}
	
}
