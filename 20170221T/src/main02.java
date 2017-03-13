public class main02 {

	public static void main(String[] args) {
		int a = 11;
		int b = 10;

		// if ~ else
		// => 이거 아님 저거

		// a변수에 들어 있는 값이 b변수에 들어있는 값보다 크냐?
		if (a > b) {
			// 크다면 중괄호 내부 문장 실행
			System.out.println("a는 b보다 크다");

		}
		// 아니면
		else {
			// 중괄호 내부 문장 실행
			System.out.println("a는 b보다 같거나 작다");
		}

		if (a == b) {
			System.out.println("a는 b와 같다");
		} else {
			System.out.println("a는 b와 다르다");
		}

		// a와 b가 같니?
		if (a == b) {
			System.out.println("a는 b와 같다.");
		}
		// 그게 아니면 a가 b보다 크니?
		else if (a > b) {
			System.out.println("a는 b보다 크다");
		} else if (a < b) {
			System.out.println("a는 b보다 작다");
		}
		// 그것도 아니면
		else {
			System.out.println("그 외");
		}

	}

}
