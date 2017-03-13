package example_class;

public class B extends A {

	// public B() {
	// System.out.println("B() 생성");
	// }

	// 부모클래스의 생성자에 매개변수가 있으면
	// 자식클래스에서 부모클래스의 매개변수까지
	// 받아내어 명시적으로 부모클래스의 인스턴스를
	// 만들어야 한다.

	public B(int num1, int num2) {

		// super 키워드 위에 코드가 존재 한다는 이야기는
		// 부모클래스가 만들어 지지 않았는데 자식 클래스에서
		// 무엇인가를 진행 한다는 이야기 이다. 따라서 super 키워드 윗쪽 코드에는
		// 어떠한 코드도 들어 갈수 없다.

		super(num1); // 부모클래스의 생성자 호출
	}

	public void goo() {
		// A a1 = super(10); // 부모 클래스를 기반으로 객체를 만드는 것
		//A a2 = new A(10); // 새로운 객체를 만드는것
	}

}
