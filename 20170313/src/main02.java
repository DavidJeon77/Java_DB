import example_class.*;

public class main02 {
	public static void main(String[] args) {
		// 1) toString

		A a1 = new A(10);
		A a2 = new A(10);

		String str = a1.toString();
		System.out.println(a1);
		System.out.println(str);
		// example_class.A@7852e922
		// example_class.A@7852e922
		// 패키지이름.클래스이름@메모리주소값

		// 2) equals
		// 동등연산자( == )와 같음

		if (a1 == a2) {
			System.out.println("a1=a2");
		} else {
			System.out.println("a1!=a2");
		}

		Person p1 = new Person("A", 25, "0313");
		Person p2 = new Person("A", 25, "0313");

		if (p1 == p2) {
			System.out.println("p1 = p2");

		} else {
			System.out.println("p1 != p2");
		}

		// Object 클래스의 equals 사용
		if (p1.equals(p2)) {
			// p1을 기준으로 p2를 비교한다. 메소드를 호출한쪽이 기준값이다.

			// Object클래스에서는 기본적으로 equals 메소드를 동등 연산자와 동일 하게 사용한다
			// -> 메모리 주소값 비교

			System.out.println(" = ");
		} else {
			System.out.println(" != ");
		}

	}
}
