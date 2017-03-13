public class main02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		// if ~ else
		// 이것 아님 저것

		if (a > b) {
			System.out.println("a는 b보다 크다");

		} else {
			System.out.println("a는 b보다 같거나 작다");
		}

		if (a == b) {
			System.out.println("a는 b와 같다");
		} else {
			System.out.println("a는 b와 다르다");
		}
		
		// a와 b가 같은가?
		if(a == b){
			System.out.println("a는 b와 같다");
		}
		// 그게아니면 a가 b보다 큰가?			else if의 사용횟수는 제한이 없다.
		else if(a > b){
			System.out.println("a는 b보다 크다");
		}
		//그것도 아니면
		else{
			System.out.println("a는 b보다 작다");
		}
	}

}
