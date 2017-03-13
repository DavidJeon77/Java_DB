import example_class.Derived;

public class main01 {

	public static void main(String[] args) {
		Derived derived = new Derived();

		derived.foo(); // 부모가 물려준 foo();
		derived.goo(); // 자식 클래스에 정의된 goo();

	}

}
