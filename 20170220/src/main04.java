public class main04 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 > 10);
		System.out.println(num1 >= 10);

		System.out.println(num2 < 10);
		System.out.println(num2 < num1);

		// = -> 대입연산자
		// == -> 같은가? 일반적인 등호
		// != -> 다른가? 부정
		System.out.println(num1 == 10); // ==는 같은가?
		System.out.println(num1 != 10); // !=는 다른가? 물어보는것이다.
		System.out.println(num1 != num2);

		// num1이 5보다 크고 10보다 작거나 같은가
		System.out.println(num1 > 5 && num1 <= 10);

		System.out.println(num2 <= 5 || num2 > 10);

		// &&(AND) : 왼쪽이 거짓이면 오른쪽 연산은 수행하지 않는다.
		// ||(OR) : 왼쪽이 참이면 오른쪽 연산은 수행하지 않는다.

		// 조건연산자 (삼항연산자) ?
		// num1이 num2보다 크다면 num3에 15을 집어 넣고
		// 아니면 20을 집어 넣어라.
		// 조건(비교, 논리) -> boolean이 결과 ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장
		int num3 = num1 < num2 ? 15 : 20;

		System.out.println(num3);

		int num4 = 5;
		num4 += 10; // num4 = num4 + 10 과 같은 표현
		System.out.println(num4);

		num4 -= 10;
		num4 *= 1;
		num4 /= 1;

	}

}
