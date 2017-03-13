package example_class;

public class A {

	private int num;
	// public A() {
	// System.out.println("A() 생성");
	// }

	public A(int num) {
		this.num = num;
	}

	// web 프로그래밍 시에 자주 써먹음
	// jdbc 프로그래밍 시에 자주 써먹음
	
	// @Override
	// public String toString() {
	//
	// return "[num]" + this.num;
	// }

	// 맴버변수가 여러개 있을경우
	// 우클릭 -> Source -> Generate toString ...

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}

}
