public class main04 {
	public static void main(String[] args) {

		B b1 = new B();
		b1.m_num++;
		// b1.s_num++;
		B.s_num++;

		System.out.println(b1.m_num);
		System.out.println(B.s_num);
		System.out.println();

		B b2 = new B();
		b2.m_num++;
		// b2.s_num++;
		B.s_num++;

		System.out.println(b2.m_num);
		System.out.println(B.s_num);
		System.out.println();

		B b3 = new B();
		b3.m_num++;
		// b3.s_num++;
		B.s_num++;

		System.out.println(b3.m_num);
		System.out.println(B.s_num);
		System.out.println();

		b1.foo(); // 일반 멤버 메소드는 참조변수를 이용하여 호출
					// why? 객체가 만들어 져야만 사용 가능한 상태가 되기 때문에

		B.goo(); // 정적 메소드는 프로그램 시작 할 때 이미 사용 가능한 상태
					// 따라서 참조 변수가 필요 없다. (정적 변수도 마찬가지)

	}
}
