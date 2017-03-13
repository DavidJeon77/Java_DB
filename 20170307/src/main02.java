public class main02 {

	public static void main(String[] args) {

		// 조건문

		/*
		 * if (조건) { // if가 참일 때 수행할 문장 } else if (조건) { // if가 거짓일때 // else if
		 * 조건이 참일때 수행할 문장 // else if 문은 여러개가 올수 있다. } else { // if와 else if의 조건이
		 * 모두 거짓일 때 수행 할 문장 }
		 */

		int num1 = 10;
		int num2 = 30;

		if (num1 == num2) {
			System.out.println("num1 = num2");
		} else {
			System.out.println("num1 != num2");
		}

		if (num1 == num2) {
			System.out.println("num1 = num2");
		} else if (num1 > num2) {
			System.out.println("num1 > num2");
		} else if (num1 < num2) {
			System.out.println("num1 < num2");
		} else {
			System.out.println("?????");
		}

		// 조건문을 잘 못 사용한 경우
		if (num1 == num2) {
			System.out.println("num1 = num2");
		}
		if (num1 > num2) {
			System.out.println("num1 > num2");
		}
		if (num1 < num2) {
			System.out.println("num1 < num2");
		}

		// 중첩된 조건문
		if (num1 >= num2) {
			System.out.println("num1 >= num2");
			if (num1 > num2) {
				System.out.println("num1 > num2");
			} else {
				System.out.println("num1 = num2");
			}
		}else{
			System.out.println("num1 < num2");
		}
		
		
		
		
		

	}

}
