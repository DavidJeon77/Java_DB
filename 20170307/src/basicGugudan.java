public class basicGugudan {

	public static void main(String[] args) {

		// �ݺ��Ǵ� ����
		// 1) �ܼ� 2~9��
		// 2) �������� �� 1~9

		for (int i = 2; i < 10; i++) {

			System.out.println(" \n" + i + " dan");

			for (int j = 1; j < 10; j++) {

				System.out.println(i + " * " + j + " = " + (i * j));

			}

		}

	}

}
