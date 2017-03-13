import example_class3.*;

public class main03 {
	public static void main(String[] args) {

		// AA aa = new AA(10);

		// 익명 클래스 -> 람다식과 연관(함수지향 프로그래밍)
		AA a1 = new AA(10) {

			@Override
			protected void foo() {
				// TODO Auto-generated method stub

			}

		};

	}
}
