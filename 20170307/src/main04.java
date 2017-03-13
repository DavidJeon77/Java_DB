public class main04 {

	public static void main(String[] args) {

		// 반복문
		// for, while, do ~ while

		// 1) for
		// 횟수제 반복에 유리

		// 2) while, do ~ while
		// 조건에 만족 할 때 반복
		// while : 한번도 실행이 안될 수 있다.
		// do ~ while : 무조건 한번은 실행이 된다.

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
