public class main05 {

	public static void main(String[] args) {

		// break, continue
		// break : switcha�̤��̳� �ݺ������� �ڵ��� {}�� ����� ���ش�.(�� �̻� �������� �ʴ´�.)
		// continue : �ݺ��� �����ϰ� �ٽ� ���ǰ˻縦 �����Ѵ�.(for���� ������ ����)

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("i�� 5�϶� break");
				break;
			}
			System.out.println("Hello " + i);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("i�� ¦���϶� continue" + i);
				continue;
			}
			System.out.println("Hello " + i);

		}

		System.out.println("end");
	}

}
