public class main07 {

	public static void main(String[] args) {
		// break
		// �ݺ����� switch ~ case������ ���ȴ�
		// �ڵ��� ������ ���߰� �ش��ϴ� �߰�ȣ(�ڵ��)�� ������

		// continue
		// �ݺ��������� ��� �����ϴ�.
		// �ڵ��� ������ ���߰� ���ǰ˻縦 �����Ѵ�.(for���� ��쿡�� ���� ����)

		int a = 0;

		while (true) {
			a++;
			System.out.println("while ����");
			System.out.println(a);

			if (a == 5) {
				break; // a��� ������ ���� 5�� �Ǹ� �ݺ��� ���߰ڴ�.
						// ���ǰ˻縦 �ٽ� ���� �ʴ´�.(�ݺ� ���� ����)
			}
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			System.out.println("for�� ����");
		}
		// break : �ݺ����Ǵ� switch~case���� ������ ������ �����.(���� �˻縦 �ٽ� �������� �ʴ´�.)
		// continue : �ش��ϴ� �ݺ��� �����ǰ� ���� �ݺ��� ���� ���ǰ˻��� �����Ѵ�.
		// (for���� ��쿡�� �������� ������� �Ѵ�)

	}

}
