public class B {

	public int m_num = 10; 			// BŬ������ ��ü�� �ɶ� ��� ���� �ϰ� ��(�Ҵ��� ��)
	public static int s_num = 10; 	// ���α׷��� ���� �� �� ���� �̹� ��� ���� �ϰ� ��.
									// �� BŬ������ ��ü�� ���� �ʾƵ� ��� �� �� �ִ� ����

	// static method
	public void foo() {
		System.out.println("member_mothod foo()");
		goo();
	}
	// �Ϲ� ��� �޼ҵ忡�� ���� �޼ҵ峪 ���� ������ ��� �� �� ������? (O)

	
	public static void goo() {
		System.out.println("static_mothod goo()");
		//foo();
	}
	// ���� �޼ҵ� ���ο��� �Ϲ� ��� ������ �޼ҵ带 ��� �� �� ������? (X)

}
