public class main01 {
	public static void main(String[] args) {

		A a = new A();
		a.setNum(10);
		a.printNum();

		a = new A(); // 기존에 존재하던 A의 객체(num에 10이 들어간 객체)는 가비지 컬렉션의 대상이 된다.

		a.printNum();

		A a1 = new A();
		a1.setNum(100);
		a1.printNum();

		A a2 = a1;

		a2.setNum(200);
		a1.printNum();
		// 메모리 주소값을 생각해야 한다.

	}

}

class A {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public void printNum() {
		System.out.println(num);
	}

	// 매개변수의 사용 범위는 해당 메소드
	public void foo(int a) {
		// 지역변수의 사용 범위는 해당 메소드
		int b = 10;

		if (b == 10) {
			// int b = 20;
			b = 10;

			int c = 10;

		}
		// c = 10;

		// 중괄호만 만들수도 있다.
		{
			int d = 10;
		}
		// d = 20;

	}

	// 메소드 오버로딩
	// 동일한 이름의 메소드를 매개변수가 다르게 해서 여러개 정의 하는 것
	// 매개변수의 자료형 종류 또는 순서 또는 개수가 다르면 오버로딩 조건이 성립한다.

	public void goo() {
		System.out.println("call - goo()");

	}

	// 메소드가 같은 이름이어도 유일한 형태의 매개변수를 갖는 다면 정의 할 수 있다. => 오버로딩
	public void goo(int num) {
		System.out.println("call - goo(int)" + num);

	}

	// public void goo(int aaa) {
	//
	// }

	public void goo(double d_num) {
		System.out.println("call - goo(double)" + d_num);
	}

	public void goo(int num, double d_num) {
		System.out.println("call - goo(int, double)" + num + d_num);
	}

	public void goo(double d_num, int num) {
		System.out.println("call - goo(double, int)" + d_num + num);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
