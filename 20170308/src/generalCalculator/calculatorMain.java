package generalCalculator;

import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		// ����� ����

		calculator cal = new calculator();

		Scanner scan = new Scanner(System.in);

		System.out.println("�����ڸ� �Է��ϼ���.");
		cal.setSymbol(scan.next().toString());

		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		cal.setNum1(scan.nextInt());
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		cal.setNum2(scan.nextInt());

		cal.Calculator();

	}
}
