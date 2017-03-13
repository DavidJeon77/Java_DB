package generalCalculator;

import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		// 사용자 입장

		calculator cal = new calculator();

		Scanner scan = new Scanner(System.in);

		System.out.println("연산자를 입력하세요.");
		cal.setSymbol(scan.next().toString());

		System.out.println("첫번째 숫자를 입력하세요.");
		cal.setNum1(scan.nextInt());
		System.out.println("두번째 숫자를 입력하세요.");
		cal.setNum2(scan.nextInt());

		cal.Calculator();

	}
}
