public class main01 {
	public static void main(String[] args) {

		A a = new A();
		a.setNum(10);
		a.printNum();

		a = new A(); // ������ �����ϴ� A�� ��ü(num�� 10�� �� ��ü)�� ������ �÷����� ����� �ȴ�.

		a.printNum();

		A a1 = new A();
		a1.setNum(100);
		a1.printNum();

		A a2 = a1;

		a2.setNum(200);
		a1.printNum();
		// �޸� �ּҰ��� �����ؾ� �Ѵ�.

	}

}

class A {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public void printNum() {
		System.out.println(num);
	}

	// �Ű������� ��� ������ �ش� �޼ҵ�
	public void foo(int a) {
		// ���������� ��� ������ �ش� �޼ҵ�
		int b = 10;

		if (b == 10) {
			// int b = 20;
			b = 10;

			int c = 10;

		}
		// c = 10;

		// �߰�ȣ�� ������� �ִ�.
		{
			int d = 10;
		}
		// d = 20;

	}

	// �޼ҵ� �����ε�
	// ������ �̸��� �޼ҵ带 �Ű������� �ٸ��� �ؼ� ������ ���� �ϴ� ��
	// �Ű������� �ڷ��� ���� �Ǵ� ���� �Ǵ� ������ �ٸ��� �����ε� ������ �����Ѵ�.

	public void goo() {
		System.out.println("call - goo()");

	}

	// �޼ҵ尡 ���� �̸��̾ ������ ������ �Ű������� ���� �ٸ� ���� �� �� �ִ�. => �����ε�
	public void goo(int num) {
		System.out.println("call - goo(int)" + num);

	}

	// public void goo(int aaa) {
	//
	// }

	public void goo(double d_num) {
		System.out.println("call - goo(double)" + d_num);
	}

	public void goo(int num, double d_num) {
		System.out.println("call - goo(int, double)" + num + d_num);
	}

	public void goo(double d_num, int num) {
		System.out.println("call - goo(double, int)" + d_num + num);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
