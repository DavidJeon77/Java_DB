public class main01 {

	public static void main(String[] args) {

		// 연산자
		// 단항 연산자 - 항이 하나밖에 없는 단항.
		// 전위 증감 연산 - 문장이 끝나기 전(세미콜론 - ;)을 만나기 전에 증가 또는 감소
		// 후위 증감 연산 - 문장이 끝나고 나서 증가 또는 감소

		int num1 = 10;
		int num2 = 20;

		System.out.println((++num1) + (++num2)); // 11 + 21 = 32

		System.out.println((num1--) + (++num2)); // 11 + 22 = 33

		num1 = 5;
		num2 = 2;

		// 나눗셈 연산

		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

		System.out.println((double) num1 / num2);
		System.out.println(num1 / (double) num2);

		// 관계연산자

		System.out.println(num1 > num2);// num1이 num2보다 크다.
		System.out.println(num1 >= num2);// num1이 num2보다 크거나 같다.

		System.out.println(num1 < num2);// num1이 num2보다 작다.
		System.out.println(num1 <= num2);// num1이 num2보다 작거나 같다.

		// 동등연산자

		System.out.println(num1 == num2);// num1이 num2와 같다.
		System.out.println(num1 != num2);// num1이 num2와 같지 않다.
		System.out.println(num1 != 5);//

		// 논리연산자
		// && (AND)
		// || (OR)

		System.out.println(num1 == 5 && num2 == 2);
		System.out.println(num1 == 5 || num2 == 2);

		// 삼항연산자(조건 연산자)
		// BOOLEAN ? 실행1 : 실행2
		// BOOLEAN이 참이면 실행1 문장 수행
		// BOOLEAN이 거짓이면 실행2 문장 수행

		// 간단한 조건 비교 후 결과를 확인 할 때 사용한다.
		String result = num1 > 5 ? "AAA" : "BBB";
		System.out.println(result);

		// num1이 0과 10사이에 있는 값이라면 "DDD" 아니면 "EEE" 출력
		// 0 < num1 < 10
		result = num1 > 0 && num1 < 10 ? "DDD" : "EEE";
		System.out.println(result);

		num2 = 10;

		num2 += 10;
		System.out.println(num2);
		num2 -= 10;
		System.out.println(num2);

		num2 *= 5;
		System.out.println(num2);
		num2 /= 5;
		System.out.println(num2);
		num2 %= 5;
		System.out.println(num2);

	}
}
