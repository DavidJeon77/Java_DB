package pkg_calc;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();

		
		int mainMenu = -1;

		while (mainMenu != 3) {
			System.out.println("----------------");
			System.out.println("[1]일반용\t[2]공학용\t[3]종료");
			System.out.println("----------------");
			System.out.print(">> ");
			mainMenu = scan.nextInt();
			int calcModeMenu = -1;

			int calcMode = -1;

			double num1, num2;
			switch (mainMenu) {
			case 1:
				calc.setCalcMode(new GeneralCalc());
				break;
			case 2:
				calc.setCalcMode(new ScientificCalculator());
				break;
			case 3:
				continue;
			}

			System.out.println("-------------------");
			System.out.println("[1]단항\t[2]이항");
			System.out.println("-------------------");
			System.out.print(">> ");
			calcModeMenu = scan.nextInt();
			switch (calcModeMenu) {
			case 1:
				calc.printMonadic();
				System.out.print(">> ");
				calcMode = scan.nextInt();
				System.out.print("단항 입력 >> ");
				num1 = scan.nextInt();
				calc.monadic(num1, calcMode);
				break;
			case 2:
				calc.printBinomial();
				System.out.print(">> ");
				calcMode = scan.nextInt();
				System.out.print("첫번째 항 입력 >> ");
				num1 = scan.nextInt();
				System.out.print("두번째 항 입력 >> ");
				num2 = scan.nextInt();
				calc.binomial(num1, num2, calcMode);
				break;
			}
		}
		scan.close();
		
		System.out.println("종료");
	}

}
