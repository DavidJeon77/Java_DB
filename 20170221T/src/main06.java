public class main06 {

	public static void main(String[] args) {

		// while(����)
		// �ѹ��� ���� ���� ���� �� �ִ�.
		// while�� ���� �� ������ false���..

		// do ~ while(����)
		// ������ ���� �ʴ��� ������ �ѹ��� ������ �ȴ�.

		int a = 10;
		int b = 10;

		System.out.println("while�� ����");
		while (a != b) {
			System.out.println("while~~");
		}

		System.out.println("do ~ while�� ����");
		do {
			System.out.println("do ~ while");
		} while (a != b);

		// while�� Ȱ�� // ~ �� �� ���� �ݺ��ض�

		// a�� 20���� ���� �� ���� �ݺ� �ض�
		while (a < 20) {
			System.out.println("while���Դϴ�.");
			a++; // while�� �ݺ��� ���� �ؾ� �ϴ� ������ while�� ���ο� �־�� �Ѵ�.
					// ���� ���� �ܺο� ���� �ϱ⵵ �Ѵ�.(ex : thread)
		}

		int max = 9;
		int horizontal = 3;
		int vertical = max / horizontal;
		int moreLine = max % horizontal;
		int start = 2;

		// 1) ���� ���
		for (int i = 0; i < (moreLine == 0 ? vertical : vertical + 1); i++) {
			// 2) 1~10 ���ϱ��
			for (int j = 1; j < 10; j++) {
				// 3) ������ŭ..
				for (int k = 0; k < horizontal && start + k <= max; k++) {
					System.out.print(start + k + " * " + j + " = "
							+ (start + k) * j + "\t");
				}
				System.out.println();
			}
			start += horizontal;
			System.out.println();

		}

	}
}
