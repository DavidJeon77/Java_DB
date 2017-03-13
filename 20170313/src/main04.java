import example_class2.*;

public class main04 {
	public static void main(String[] args) {

		// Up-Casting
		// 자식 is a 부모가 성립됨 (논리적으로 성립이 되어야 한다.)

		Shape s = new Circle(10); 	// 원을 만들고 이걸 도형이라고 부른다.
		s.makeArea(); 				// 도형(원)의 넓이를 구해라 => 원의 넓이를 구해라

		System.out.println(s); 	// 원을 도형으로 부르겠다. 도형을 객체로 불러서
								// 객체의 정보를 출력해라 -> 원에 대한 정보를 출력해라
								// println(Object x)

		// Down-Casting
		// 부모 is a 자식 (논리적으로 성립되지 않는다.)
		// Circle c = new Shape();	// 추상클래스가 아니더라고 논리적으로 알맞지 않기 때문에 컴파일 오류
		
		// 하지만 도형이 애초에 어떠한(원이던, 사각형이던) 도형으로 만들어져 있다면 논리적으로 맞다.
		// 이 도형은 원이다.
		
		Circle c = (Circle)s;	// 이 도형은 원이다.
		Square sq = (Square)s;	// 이 도형은 사각형이다.(문법 O, 논리 O)
								// 하지만  애초에 도형이 원으로 만들어져 있기 때문에
								// 컴파일에서는 에러가 안나지만, 실행 시에 에러가 난다.
								// ClassCastException(형 변환 예외)
		
	}
}
