public class Gugudan {

	public static void main(String[] args) {

		// 2~4���� ���ٿ� �̱�

		// for (int i = 2; i < 10; i += 3) {
		// System.out.println();
		//
		// for (int j = 1; j < 10; j++) {
		//
		//
		// System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		//
		// System.out.print((i + 1) + " * " + j + " = " + (i * j) + "\t");
		//
		// if (i < 8) {
		//
		// System.out.print((i + 2) + " * " + j + " = " + (i * j));
		// }
		//
		// System.out.println();
		// }
		//
		// }

		// int max = 10;
		// int horizon = 3;
		//
		// // 2~9��
		// for (int i = 1; i <= max; i += horizon) {
		// System.out.println();
		//
		// // 1~9���� �ݺ�
		// for (int j = 1; j <= 9; j++) {
		//
		// for (int k = i; k < i + horizon; k++) {
		//
		// if (k <= max) {
		//
		// System.out
		// .print(k + " * " + j + " = " + (k * j) + "\t");
		//
		// }
		//
		// }
		// System.out.println();
		//
		// }
		//
		// System.out.println();
		// }

		int dan = 2;

		// 3�� �ݺ�
		for (int k = 1; k <= 9; k += 3) {

			// ����
			for (int j = 1; j <= 9; j++) {
				System.out.println();

				// ��
				for (int i = dan; i < dan + 3; i++) {
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				}

			}
			System.out.println();

			dan += 3;
			

		}

	}

}
