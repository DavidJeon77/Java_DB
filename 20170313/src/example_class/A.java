package example_class;

public class A {

	private int num;
	// public A() {
	// System.out.println("A() ����");
	// }

	public A(int num) {
		this.num = num;
	}

	// web ���α׷��� �ÿ� ���� �����
	// jdbc ���α׷��� �ÿ� ���� �����
	
	// @Override
	// public String toString() {
	//
	// return "[num]" + this.num;
	// }

	// �ɹ������� ������ �������
	// ��Ŭ�� -> Source -> Generate toString ...

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}

}
