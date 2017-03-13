public class main02 {

	public static void main(String[] args) {
		// 1) ���ɽ���
		// �ڽ� is a �θ� ��� ������ ������� �ʴ�.(���� �����̴�... (O) )
		Shape shape = new Circle(10);
		shape.showShapeInfo();

		// 2) �ٿ��ɽ�Ʈ
		// �θ� is a �ڽ� �̶�� ������ ����ϴ�. (������ ���̴�... (X) )

		// Circle circle = new Shape(); // error!!! ������ ���̴� ��� ���谡 ���� �� �� ����.

		// ��ĳ������ ���� ���� �Ǿ�� �Ѵ�.
		Square square = new Square(20, 30);
		Shape squareShape = square;

		Shape squareShape2 = new Square(20, 30);

		Square downSquare = (Square) squareShape;
		Square downSquare2 = (Square) squareShape2;

		// Circle erorrCircle = (Circle) squareShape; // ������ ������ ����.
		// ���� �� ������ ����.

		// ������ instanceof
		// A instanceof B => boolean ����� ����
		// A �� B Ŭ������ �θ� �� �ִ°�?
		// A �� B Ŭ������ �̷���� �ִ°�?

		// ex) �θ� instanceof �ڽ� => �� �θ� �ڽ��̶�� �θ� �� �ִ°�? (�� ������ �簢���̶�� �� �� �ִ°�?)
		// ex) �ڽ� instanceof �θ� => �� �ڽ��� �θ�Ŭ������ ������� �ϴ°�? (�� �簢���� ������ ������� �������
		// �ִ°�?)

		// �� ������ �簢�� �Դϱ�?
		if (squareShape instanceof Square) {
			System.out.println("Yes, it` Square!!");
		}

		if (shape instanceof Circle) {
			System.out.println("Yes, it` Circle !!");
		} else {
			System.out.println("nope !");
		}

		// �簢���� ���� �Դϱ�?
		if (square instanceof Shape) {
			System.out.println("Yes, it`s Square !!");
		}

	}

}
