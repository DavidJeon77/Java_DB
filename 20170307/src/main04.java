public class main04 {

	public static void main(String[] args) {

		// �ݺ���
		// for, while, do ~ while

		// 1) for
		// Ƚ���� �ݺ��� ����

		// 2) while, do ~ while
		// ���ǿ� ���� �� �� �ݺ�
		// while : �ѹ��� ������ �ȵ� �� �ִ�.
		// do ~ while : ������ �ѹ��� ������ �ȴ�.

		// for (int i = 1; i <= 1000000; i *= 2) {
		// System.out.println("Hello " + i);
		// }

		int num = 5;

		while (num < 5) {
			System.out.println("hello " + num);
			num++;
		}
		System.out.println("end");

		int num2 = 1;

		while (num2 < 5) {
			System.out.println("hello " + num2);
			num2++;

		}
		do {
			System.out.println("hello " + num2);
		} while (num2 < 5);
		System.out.println("end");

	}
}
