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

		b1.foo(); // �Ϲ� ��� �޼ҵ�� ���������� �̿��Ͽ� ȣ��
					// why? ��ü�� ����� ���߸� ��� ������ ���°� �Ǳ� ������

		B.goo(); // ���� �޼ҵ�� ���α׷� ���� �� �� �̹� ��� ������ ����
					// ���� ���� ������ �ʿ� ����. (���� ������ ��������)

	}
}
