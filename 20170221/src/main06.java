public class main06 {

	public static void main(String[] args) {
		// while (조건)
		// 한번도 실행 되지 않을 수 있다.
		// while문 진입 전 조건이 false라면...

		// do ~ while (조건)
		// 조건이 맞지 않더라도 무조건 한번은 실행이 된다.

		int a = 10;
		int b = 10;

		System.out.println("while문 실행");
		while (a != b) {
			System.out.println("while ~~");
		}

		System.out.println("do ~ while문 실행");
		do {
			System.out.println("do ~ while");
		} while (a != b);

		// while문 활용	// ~ 할 때 까지 반복해라
		// 해당 while문은 for문으로 대체 가능함
		while (a < 20) {
			System.out.println("while문 입니다.");
			a++; 	// while 문 반복을 중지 해야 하는 조건은 while문 내부에 있어야 한다.
					// 때에 따라서 외부에 존재하기도 한다. (ex : thread)
		}

	}

}
