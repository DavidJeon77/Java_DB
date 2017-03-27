package example_4op;

public class Operator {

	int num1;
	int num2;
	int result;

	public void printResult() {
		System.out.println(num1 + " + " + num2 + " = " + (result = num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (result = num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (result = num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (result = num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (result = num1 % num2));

	}

}
