public class main03 {

	public static void main(String[] args) {
		int a = 10;
		a++; // 후위증가 (세미콜론을 지나가면 1이 증가 된다.) 10
		System.out.println(a); // a => 11

		int b = 10;
		++b; // 전위증가 (세미콜론을 지나기전에 1이 증가 된다.) 11
		System.out.println(b);

		int c = 10;
		int d = 10;

		System.out.println(c++);
		System.out.println(++d);

		System.out.println(2 + 2); // 4
		System.out.println(2 + 2 * 2); // 곱샘의 우선 순위가 높기때문에 2*2부터 연산함
										// 6

		System.out.println(2 + 2 / 2 * 3 + 2 / 1 - 3 + 1 / 4 * 2);
		System.out.println(2 + ((2 / 2) * 3) + (2 / 1) - 3 + ((1 / 4) * 2));

		// 메모리 크기에 따른 나눗셈
		System.out.println(5 / 2); // 몫 구하기
		System.out.println(5 % 2); // 나머지 구하기

		System.out.println((double) 5 / 2); // 실수값을 구하기위해서 5를 실수형으로 강제형변환을 하고
											// 실수/정수 연산결과로 2.5가 나옴
		System.out.println(5 / (double) 2); // 실수값을 구하기위해서 2를 실수형으로 강제형변환을 하고
											// 정수/실수 연산결과로 2.5가 나옴
		System.out.println((double) (5 / 2)); // 정수5 / 정수2 의 연산결과로 정수2(몫)의 값이
												// 나온것을 실수형으로 바꿔서 2.0이 나옴

	}

}
