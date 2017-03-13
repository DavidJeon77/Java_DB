public class main02 {

	public static void main(String[] args) {
		// 1) 업케스팅
		// 자식 is a 부모 라는 문장이 어색하지 않다.(원은 도형이다... (O) )
		Shape shape = new Circle(10);
		shape.showShapeInfo();

		// 2) 다운케스트
		// 부모 is a 자식 이라는 문장은 어색하다. (도형은 원이다... (X) )

		// Circle circle = new Shape(); // error!!! 도형은 원이다 라는 관계가 설정 될 순 없다.

		// 업캐스팅이 먼저 수행 되어야 한다.
		Square square = new Square(20, 30);
		Shape squareShape = square;

		Shape squareShape2 = new Square(20, 30);

		Square downSquare = (Square) squareShape;
		Square downSquare2 = (Square) squareShape2;

		// Circle erorrCircle = (Circle) squareShape; // 컴파일 에러가 없다.
		// 실행 시 에러가 난다.

		// 연산자 instanceof
		// A instanceof B => boolean 결과값 나옴
		// A 는 B 클래스로 부를 수 있는가?
		// A 는 B 클래스로 이루어져 있는가?

		// ex) 부모 instanceof 자식 => 이 부모를 자식이라고 부를 수 있는가? (이 도형을 사각형이라고 할 수 있는가?)
		// ex) 자식 instanceof 부모 => 이 자식은 부모클래스를 기반으로 하는가? (이 사각형은 도형을 기반으로 만들어져
		// 있는가?)

		// 이 도형이 사각형 입니까?
		if (squareShape instanceof Square) {
			System.out.println("Yes, it` Square!!");
		}

		if (shape instanceof Circle) {
			System.out.println("Yes, it` Circle !!");
		} else {
			System.out.println("nope !");
		}

		// 사각형이 도형 입니까?
		if (square instanceof Shape) {
			System.out.println("Yes, it`s Square !!");
		}

	}

}
