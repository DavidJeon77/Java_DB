public class main03 {

	public static void main(String[] args) {
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));
		System.out.println();
		sr.readShape(new Square(20, 30));
		System.out.println();
		sr.readShape(new Triangle(15, 7));
		System.out.println();

		// 추상 클래스는 자식 클래스에 의해서만 메모리 할당을 받을 수 있다.
		Shape s = new Circle(20);

		/*
		 * sr.readShape(new Shape());
		 * 
		 * Shape shape = new Shape();
		 * 
		 * Circle circle = (Circle) shape; Square square = (Square) shape;
		 */
	}

}
