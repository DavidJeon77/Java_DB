public class main05 {

	public static void main(String[] args) {
		// for문 내에서 초기값으로 설정한 변수를 for문 내에서 사용 할 수 있다.
		// 횟수별 반복에 최적화 되어있다.
		// 보통은 초기값으로 설정된 값이 조건 비교에 사용 되며, 마지막 증감식에서 초기값을 변경(증가 또는 감소)한다.
		// 단항 연산자 이외 연산대입(+=, -=, *= , /= ....) 사용 가능
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
		}

		// 구구단 표현하기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// .....
		// 9 * 8 = 72
		// 9 * 9 = 81

		// for문 중첩을 활용한 구구단 만들기
		// 중첩된 for문 경우 내부에 for문이 있으면 내부에 있는 반복문이 모두 종료 된 뒤
		// 외부 for문의 증감이 실행된다.
		// while, do ~ while도 마찬가지로 내부에 반복문이 있으면 내부 반복문이 종료 된 다음 외부의 반복문이
		// 조건검사를 실행한다.

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단");
			for (int j = 9; j > 0; j--) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

	}

}
