public interface IDoor {

	// 인터페이스의 특징
	// 1) 인터페이스 내의 모든 메소드는 추상화된 형태의 메소드이다.(자동으로 public abstract가 묵시적으로 설정됨)
	// 2) 일반적인 클래스처럼 멤버변수, 멤버 메소드를 가질 수 없다.
	// => 구현도니 메소드, 멤버변수는 인터페이스에 작성 할 수 없다.
	// 3) static 형태의 메소드는 구현된 형태로 존재 할 수 있다.
	// 4) 인터페이스의 모든 변수는 public static final 형태의 상수로 존재 한다.
	// 5) 인터페이스는 확장(extends)의 개념이 아닌 implements(구현)의 개념으로 접근
	// 6) 클래스와 다르게 다중상속 (구현)이 가능하다.

	// 일반 메소드 처럼 형태로 구현이 불가
	// public void foo(){}

	// static 메소드는 구현이 가능
	/*public static void goo() {
		System.out.println("인터페이스 내에 사용 가능");
	}

	int temp = 10; // 변수 선언시 자동으로 static final (상수) 화
*/
	// /////////////////////////////////////////////////////
	// 인터페이스에는 추상화 메소드만 있어야 한다.
	void openDoor();

	void closeDoor();

}
