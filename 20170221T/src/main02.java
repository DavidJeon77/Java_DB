public class main02 {

	public static void main(String[] args) {
		int a = 11;
		int b = 10;

		// if ~ else
		// => �̰� �ƴ� ����

		// a������ ��� �ִ� ���� b������ ����ִ� ������ ũ��?
		if (a > b) {
			// ũ�ٸ� �߰�ȣ ���� ���� ����
			System.out.println("a�� b���� ũ��");

		}
		// �ƴϸ�
		else {
			// �߰�ȣ ���� ���� ����
			System.out.println("a�� b���� ���ų� �۴�");
		}

		if (a == b) {
			System.out.println("a�� b�� ����");
		} else {
			System.out.println("a�� b�� �ٸ���");
		}

		// a�� b�� ����?
		if (a == b) {
			System.out.println("a�� b�� ����.");
		}
		// �װ� �ƴϸ� a�� b���� ũ��?
		else if (a > b) {
			System.out.println("a�� b���� ũ��");
		} else if (a < b) {
			System.out.println("a�� b���� �۴�");
		}
		// �װ͵� �ƴϸ�
		else {
			System.out.println("�� ��");
		}

	}

}
