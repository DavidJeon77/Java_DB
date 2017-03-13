public class main02 {

	public static void main(String[] args) {

		// 자바의 기본 자료형
		// 1) char 문자를 표현하기 위한 자료형 크기 : 2byte
		// 문자는 작음 따옴표를 활용한다.

		char ch = 'A'; // 한 개의 문자만 대입 할 수 있다.
		// char ch2 = 'AB'; // 에러

		// 2) byte, short, int, long
		// 연산(+,-,*,/) 시에 모든 정수 자료형을 int로 자동 형변환 하기 때문에 모든 정수를 int로 표현하는것이 좋다.
		// byte 는 자료를 모을 때나 최소 자료형으로 자료들을 분할 할 때 사용한다.

		int num = 100;
		// int num2 = 100.234;

		long l = 100L; // long형은 정수뒤에 'L'을 붙여준다.

		// 3) float, double
		// 소수점 자료형 (실수형)

		float f = 10.123f; // float형은 실수 뒤에 f 를 붙여준다.
		double d = 10.123; // double형은 실수만 표현한다.

		// 4) 논리값(true/false) 를 표현하는 boolean
		boolean b1 = true;
		boolean b2 = false;

		// boolean b3 = 10; //true/false만 들어갈 수 있다.

		// 자료의 형변환

		char ch2 = 'A'; // 2byte
		int i2 = ch2; // 4byte 작은 공간에 있는 데이터를 큰 공간의 데이터로 옮겨 질 수 있다.
						// 자동 형변환 (묵시적, 암시적 형변환)

		System.out.println(ch2);
		System.out.println(i2);

		double d2 = 10.123; // 8byte
		int i3 = (int) d2; // 4byte 명시적(강제적) 형변환

		System.out.println(d2);
		System.out.println(i3);

		byte bb = (byte) 128; // -128이 나온다 바이트의 순환을 보여주기 위한 예제
		System.out.println(bb);

		String str = "Hello"; // 문자열은 큰 따옴표
		System.out.println(str);

	}

}
