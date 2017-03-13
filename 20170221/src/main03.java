public class main03 {

	public static void main(String[] args) {

		// 1) 데이터 정의
		int score = -10;
		char grade;

		// 사용자가 잘못된 점수를 입력했을때
		// 보통 유효하지 않았을 때의 처리를 먼저 해 준다.
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수 입니다.");
		} else {

			// 2) 기능정의
			if (score >= 90 && score <= 100) {
				grade = 'A';
			} else if (score >= 80 && score <= 89) {
				grade = 'B';
			} else if (score >= 70 && score <= 79) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			System.out.println(grade);
		}

	}

}
