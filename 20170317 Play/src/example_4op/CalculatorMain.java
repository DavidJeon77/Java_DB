package example_4op;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Operator operator = new Operator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("��Ģ����");
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		operator.num1 = scanner.nextInt();
		System.out.println("ù���� ���� : " + operator.num1);
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		operator.num2 = scanner.nextInt();
		System.out.println("�ι��� ���� : " + operator.num2);

		operator.printResult();

	}

}
