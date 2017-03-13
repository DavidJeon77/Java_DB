package example_class;

public class Base {

	protected int num; // 자식클래스 및 같은 패키지에 있는 클래스에게만 공개 하는 접근지시제어자

	public void foo() {
		System.out.println("A.foo()");
	}

}
