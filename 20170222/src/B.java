public class B {
	// �޼ҵ� �����ε�
	// �޼ҵ��� �̸��� �ߺ��ؼ� ���� �ϴ� ��
	// ��, �Ű������� Ÿ�� (����) �� ����, ������ �޶�� �Ѵ�.

	/*
	 * �����ε� ����� ����ϴ� ��� �޼ҵ尡 �Ű������� ���� �ǹ̰� ����� �۾��� ���� �� �� e.g)
	 * System.out.println();
	 * 
	 * char ���� ��� �޼ҵ�� : System.out.printChar(char ch); 
	 * int ���� ��� �޼ҵ�� : System.out.printInt(int i); 
	 * boolean ���� ��� �޼ҵ�� : System.out.printBoolean(boolean b);
	 */

	void foo() {
		System.out.println("B_FOO()");
	}

	// �޼ҵ��� �̸��� �Ȱ����� �Ű������� �ٸ��� ������ ���� ����(�����ε�)
	void foo(int num) {
		System.out.println("B_FOO() : " + num);
	}

	// �Ű������� ���� (�ڷ���)�� �ٸ��� ������ �����ε� ����
	void foo(double d) {
		System.out.println("B_FOO(double) : " + d);
	}

	// �Ű������� ������ �ٸ��� ������ �����ε� ����
	void foo(int num1, int num2) {
		System.out.println("B_FOO(int,int) : " + num1 + " " + num2);
	}

	// �Ű������� ������ �޶� �����ε� ����
	void foo(int num, double d) {
		System.out.println("B_FOO(int,doeble) : " + num + " " + d);
	}

	void foo(double d, int num) {
		System.out.println("B_FOO(doeble,int) : " + d + " " + num);
	}

	// �Ű������� �������� �����ε� ���� ���ǿ� ���Ե��� �ʴ´�.

}
