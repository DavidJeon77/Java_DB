package exitReturn;

public class Divide {

	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0���δ� ���� ���� �� �����ϴ�.");
			return;
		}
		System.out.println("������ ��� ; " + (num1 / num2));
	}

}
