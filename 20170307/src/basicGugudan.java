public class basicGugudan {

	public static void main(String[] args) {

		// 반복되는 패턴
		// 1) 단수 2~9단
		// 2) 곱해지는 수 1~9

		for (int i = 2; i < 10; i++) {

			System.out.println(" \n" + i + " dan");

			for (int j = 1; j < 10; j++) {

				System.out.println(i + " * " + j + " = " + (i * j));

			}

		}

	}

}
