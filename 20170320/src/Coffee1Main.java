import java.util.Scanner;

public class Coffee1Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter money");

		int myMoney = scanner.nextInt();
		int cups;


		if (myMoney > 0) {
			cups = myMoney / 200;
		} else if (myMoney == 0) {
			cups = 0;
		} else {
			cups = -1;
		}

		if (cups > 0) {
			System.out.println("coffee " + cups + "cups");
		} else {
			System.out.println("put more money");
		}

	}

}
