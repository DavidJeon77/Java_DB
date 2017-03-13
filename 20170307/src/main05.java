public class main05 {

	public static void main(String[] args) {

		// break, continue
		// break : switchaㅜㄴ이나 반복문에서 코드블록 {}을 벗어나게 해준다.(더 이상 실행하지 않는다.)
		// continue : 반복을 중지하고 다시 조건검사를 수행한다.(for문은 증감식 수행)

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("i가 5일때 break");
				break;
			}
			System.out.println("Hello " + i);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("i가 짝수일때 continue" + i);
				continue;
			}
			System.out.println("Hello " + i);

		}

		System.out.println("end");
	}

}
