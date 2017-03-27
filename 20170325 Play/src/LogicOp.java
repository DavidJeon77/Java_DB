
public class LogicOp {
	public static void main(String[] args) {

		int num1 = 10, num2 = 20;

		boolean result1 = (num1 == 10 && num2 == 20);
		boolean result2 = (num1 <= 12 || num2 >= 30);

		System.out.println(result1);
		System.out.println(result2);

		if (!(num1 == num2)) {
			System.out.println("num1 != num2");
		} else {
			System.out.println("num1 == num2");
		}

	}
}
