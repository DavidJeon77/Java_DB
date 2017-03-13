// 한줄 주석

/*
 * 
 * 주석 블럭 지정
 * 
 */

// 주석에는 간단한 필요성 있는 메모를 쓴다.

public class main01 {

	// 프로그램 시작 지점
	public static void main(String[] args) {
		System.out.println("Hello world!"); // 콘솔에 Hello World 출력

		// 변수는 무조건 초기화가 되어야 사용 할 수 있다.
		int num1 = 10; // 선언과 동시에 초기화

		int num2; // 변수의 선언
		num2 = 20; // 초기화

		int num3; // 변수에 선언만 되고 초기화가 되지 않았기 때문에 에러!

		num2 = 30; // 초기화 이후에 들어오는 값은 '대입'이다.

		System.out.println(num1);
		System.out.println(num2);
		// System.out.println(num3);

	}

}
