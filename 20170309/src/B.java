public class B {

	public int m_num = 10; 			// B클래스가 객체가 될때 사용 가능 하게 됨(할당이 됨)
	public static int s_num = 10; 	// 프로그램을 시작 할 때 부터 이미 사용 가능 하게 됨.
									// 즉 B클래스가 객체가 되지 않아도 사용 할 수 있는 변수

	// static method
	public void foo() {
		System.out.println("member_mothod foo()");
		goo();
	}
	// 일반 멤버 메소드에서 정적 메소드나 정적 변수를 사용 할 수 있을까? (O)

	
	public static void goo() {
		System.out.println("static_mothod goo()");
		//foo();
	}
	// 정적 메소드 내부에서 일반 멤버 변수나 메소드를 사용 할 수 있을까? (X)

}
