package exitReturn;

public class Divide {

	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 값을 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 ; " + (num1 / num2));
	}

}
