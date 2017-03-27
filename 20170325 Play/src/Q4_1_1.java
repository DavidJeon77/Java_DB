
public class Q4_1_1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		num1 = num2 = num3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//모든 값에 30이 나오는 이유는 대입연산자는 오른쪽에서 왼쪽으로 대입연산을 진행하기 때문에 
		// num3의 값이 num2에 대입되고,
		// num2의 값이 num1에 대입되어서 num1의 값은 num3에 초기 대입된 30이 된다.

	}
}
