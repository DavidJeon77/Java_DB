
public class main03 {

	public static void main(String[] args) {
		
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));	//Shape shape = new Circle(10);
		System.out.println();
		sr.readShape(new Square(10, 20));//Shape shape = new Square(10,20);
		System.out.println();
		sr.readShape(new Triangle(10, 20));
		
		//�߻� Ŭ������ �ڽ� Ŭ������ ���ؼ��� �޸� �Ҵ��� ���� �� �ִ�.
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
