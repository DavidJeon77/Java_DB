package example_class;

public class Derived extends Base {

	public void goo() {
		num = 100;
		System.out.println("B.goo()");
		System.out.println("부모의 멤버변수 num : " + num);

	}

}
