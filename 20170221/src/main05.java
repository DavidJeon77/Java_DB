public class main05 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
		}

		// 구구단 표현하기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ......
		// 9 * 8 = 72
		// 9 * 9 = 81

		for (int i = 1; i < 10; i++) {
			System.out.println(i + " 단");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}
