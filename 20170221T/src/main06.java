public class main06 {

	public static void main(String[] args) {

		// while(조건)
		// 한번도 실행 되지 않을 수 있다.
		// while문 진입 전 조건이 false라면..

		// do ~ while(조건)
		// 조건이 맞지 않더라도 무조건 한번은 실행이 된다.

		int a = 10;
		int b = 10;

		System.out.println("while문 실행");
		while (a != b) {
			System.out.println("while~~");
		}

		System.out.println("do ~ while문 실행");
		do {
			System.out.println("do ~ while");
		} while (a != b);

		// while문 활용 // ~ 할 때 까지 반복해라

		// a가 20보다 작을 때 까지 반복 해라
		while (a < 20) {
			System.out.println("while문입니다.");
			a++; // while문 반복을 중지 해야 하는 조건은 while문 내부에 있어야 한다.
					// 때에 따라 외부에 존재 하기도 한다.(ex : thread)
		}

		int max = 9;
		int horizontal = 3;
		int vertical = max / horizontal;
		int moreLine = max % horizontal;
		int start = 2;

		// 1) 세로 덩어리
		for (int i = 0; i < (moreLine == 0 ? vertical : vertical + 1); i++) {
			// 2) 1~10 곱하기용
			for (int j = 1; j < 10; j++) {
				// 3) 갯수만큼..
				for (int k = 0; k < horizontal && start + k <= max; k++) {
					System.out.print(start + k + " * " + j + " = "
							+ (start + k) * j + "\t");
				}
				System.out.println();
			}
			start += horizontal;
			System.out.println();

		}

	}
}
