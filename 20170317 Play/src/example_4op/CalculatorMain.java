package example_4op;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Operator operator = new Operator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙연산");
		System.out.println("첫번째 숫자를 입력하세요.");
		operator.num1 = scanner.nextInt();
		System.out.println("첫번재 숫자 : " + operator.num1);
		System.out.println("두번째 숫자를 입력하세요.");
		operator.num2 = scanner.nextInt();
		System.out.println("두번재 숫자 : " + operator.num2);

		operator.printResult();

	}

}
