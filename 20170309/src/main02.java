public class main02 {
	public static void main(String[] args) {
		// ������
		// -> Ŭ������ �̿��� ��ü�� ���� �� �������� �ϵ��� ���� ������.
		// �����ڴ� ��ü �ϳ��� �ѹ��� ȣ���� �ȴ�. �ι��̻� ȣ���� �ȴٴ� �̾߱�� ���ο� ��ü�� ��� ����ٴ� ��
		// new Ű����� �Բ� ��� �ȴ�.
		// �׻� public Ű���尡 �;� �ϸ�, �������°� ���� Ŭ������ �̸��� ����Ѵ�.
		// *�����ڸ� == Ŭ������
		// �Ű������� ���� �� �� �ִ�.
		// �����ε��� �����ϴ�.

		// �����ڰ� ���� �����ڸ� �ۼ��ϰ� �Ǹ�, �����Ϸ��� ����Ʈ �����ڸ� ������ �ʴ´�.
		// *����Ʈ ������ : �ƹ� �ϵ� ���� �ʴ� �⺻���� ������. ������ ��ü�� ����� �ϸ� �Ѵ�.

		AAA aaa1 = new AAA(5); // AAA(); -> ������

		AAA aaa2 = new AAA();

		AAA aaa3 = new AAA(10.123, 13);

		// AAA aaa3 = new AAA(10, 13.1234); // AAA(int, double) ������ �����ڰ� ���� ������
		// ����

	}
}

class AAA {
	// �����ڰ� ���� �����ڸ� ������ ������
	// public AAA(){} ������ �����ڸ� �ڵ����� ����� ����.

	// ������ ����
	// public AAA() {
	// System.out.println("AAA ��ü ����");
	// }

	private int num = -1;
	private double d_num = -1;

	public AAA(int i) {
		System.out.println("AAA(int) ��ü ���� " + i);
	}

	public AAA() {
		System.out.println("AAA() ��ü ����");
	}

	public AAA(double d_num, int num) {
		System.out.println("AAA(double,int) ��ü ����" + d_num + " " + num);

		// �����ڿ��� ��� �������� �ʱ�ȭ �Ѵ�.
		this.num = num;
		this.d_num = d_num;

	}

}
