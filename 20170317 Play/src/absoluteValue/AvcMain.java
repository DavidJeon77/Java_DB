package absoluteValue;

import java.util.Scanner;

public class AvcMain {

	public static void main(String[] args) {
		Avc avc = new Avc();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Firet num");
		avc.num1 = scanner.nextInt();
		System.out.println("enter Second num");
		avc.num2 = scanner.nextInt();

		avc.AvcPrintInfo();

	}

}
