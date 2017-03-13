package Calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		int mainMenu;
		boolean while_Value = true;

		int generalMenu;
		int generalMonadicMenu = 0;
		double generalMonadicValue;
		int generalBinomialMenu = 0;
		double generalBinomialValue;

		int scientificMenu;
		int scientificMonadicMenu = 0;
		double scientificMonadicValue;
		int scientificBinomialMenu = 0;
		double scientificBinomialValue;

		while (while_Value) {
			System.out.println(" [1]General\n [2]Scientific\n [3]exit");
			mainMenu = scan.nextInt();

			if (mainMenu == 1) {
				System.out.println("[1] General Calculator");

				generalMenu = scan.nextInt();
				if (generalMenu == 1) {
					System.out.println("Monadic Calculation");
					System.out.println("[1]SQRT\n[2]LOG");
					generalMonadicMenu = scan.nextInt();
					if (generalMonadicMenu == 1) {
						System.out.println("숫자를 입력하세요.");
						

					} else if (generalMonadicMenu == 2) {
						System.out.println("숫자를 입력하세요.");

					} else {
						break;
					}

				} else if (generalMenu == 2) {
					System.out.println("Binomial Calculation");
					System.out.println("[1]ADD\n[2]SUB\n[3]MUL\n[4]DIV\n");
					generalBinomialMenu = scan.nextInt();
					if (generalBinomialMenu == 1) {
						System.out.println("숫자를 입력하세요.");

					} else if (generalBinomialMenu == 2) {
						System.out.println("숫자를 입력하세요.");

					} else if (generalBinomialMenu == 3) {
						System.out.println("숫자를 입력하세요.");

					} else if (generalBinomialMenu == 4) {
						System.out.println("숫자를 입력하세요.");

					} else {

						break;
					}

				} else if (mainMenu == 2) {
					System.out.println("[2] Scientific Calculator");

					scientificMenu = scan.nextInt();
					if (scientificMenu == 1) {
						System.out.println("Scientific Calculation");
						System.out.println("[1]SQRT\n[2]LOG");
						generalMonadicMenu = scan.nextInt();
						if (generalMonadicMenu == 1) {
							System.out.println("숫자를 입력하세요.");

						} else if (generalMonadicMenu == 2) {
							System.out.println("숫자를 입력하세요.");

						} else {
							break;
						}

					} else if (generalMenu == 2) {
						System.out.println("Binomial Calculation");
						System.out.println("[1]ADD\n[2]SUB\n[3]MUL\n[4]DIV\n");
						generalBinomialMenu = scan.nextInt();
						if (generalBinomialMenu == 1) {
							System.out.println("숫자를 입력하세요.");

						} else if (generalBinomialMenu == 2) {
							System.out.println("숫자를 입력하세요.");

						} else if (generalBinomialMenu == 3) {
							System.out.println("숫자를 입력하세요.");

						} else if (generalBinomialMenu == 4) {
							System.out.println("숫자를 입력하세요.");

						} else {

							break;
						}

					} else if (mainMenu == 3) {
						System.out.println("EXIT");
						break;
					} else {
						System.out.println("올바른 숫자를 입력하세요.");
						while_Value = false;
						continue;
					}

				}

			}
		}
	}
}
