public class main01 {

	public static void main(String[] args) {
		// 자료형과 변수
		// 자료형 : 저장 또는 표현할 자료의 종류
		// 변수 : 실제 데이터(자료,값)가 저장되는 곳
		// 메모리 주소값 : 변수가 메모리에 공간이 할당 되었을때 해당 위치를 표현하는 주소값
		// 16진수 정수로 이루어져 있다. (예 : 0xABCA975D)

		// 변수의 초기화 : 어떠한 변수가 선언되고(메모리공간 할당) 값이 최초로 들어가는 것
		// 변수의 대입 : 초기화 이후 변수에 값이 대입 되는 것.

		// 1) char 자료형
		// <<문자>>를 저장하거나 나타내는 자료형
		// * 문자란? A B C ㄱ ㄴ ㄷ 가 나 다
		// 하나의 글자만 있는 데이터

		// 선언과 동시에 초기화
		char ch1 = 'A'; // 문자를 저장하거나 표현 할 때는 작은 따옴표 ''를 사용한다.

		char ch2; // 변수의 선언
		ch2 = 'B'; // 초기화

		// 초기화 되지 않은 변수는 사용 할 수 없다.
		char ch3; // 변수의 선언은 됐지만 초기화가 되지 않았음

		System.out.println(ch1);
		System.out.println(ch2);
		// System.out.println(ch3);

		// 2) int자료형
		// <<부호있는 정수>>를 저장하거나 나타내는 자료형
		// 자바의 모든 연산은 int 자료형을 기분으로 연산되기 때문에 모든 정수는 무조건 int로 생각 한다.
		// ex) short+short => int형태로 변환

		int num1 = 10;
		int num2 = -10;
		int num3 = 0;

		// int num4 = 10.123; // 에러 정수형(int형) 변수에 실수가 들어 갈 수 없다.

		// 3) double 자료형
		// <<부호있는 실수>>를 저장하거나 나타내는 자료형

		double d1 = 10.5;
		double d2 = -10.5;
		double d3 = 10; // 실수형 자료형 double에 정수 자료가 들어 갈 수 있다.

		// 자료의 형 변환

		int a = 10; // 4byte int 형태
		double d = a; // 8byte double 형태 정수 자료형 a가 가지고 있는 값을 d에 대입(초기화)
						// 작은 공간에 있는 데이터를 큰 공간의 변수로 옮길 때는 별다른 과정이 필요 없다.
						// 묵시적(암시적) 형 변환

		double dd = 10.123;
		int a1 = (int) dd; // 큰 자료형에서 작은 자료형으로 옮길 때는 에러 발생
							// 데이터의 손실을 감수 하더라도 값을 옮길때는 "명시적 형변환" 기법이 사용됨
							// 명시적 형변환은 변수 앞에 (자료형) --> type casting

		char uni_ch = 97;	//유니코드에 대응되는 정수로 초기화
		System.out.println(uni_ch);
		int uni_int = 'A';
		System.out.println(uni_int);
		
		char uni_ch2 = 'A'+1;	//char 경우에만 int 연산의 값이 char로 형변환됨
		
		
		System.out.println(uni_ch+1);
		System.out.println(uni_ch2);
		
		byte b1;
		b1=(byte)128;
		
		System.out.println(b1);
		
		String str = "Hello";
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
