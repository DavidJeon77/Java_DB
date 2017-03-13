package generalCalculator;

public class calculator {

	private int num1;
	private int num2;
	private String symbol;

	public static final String ADD = "+";	// private이 아닌 public으로 계산기 클래스와 계산기 메인에서 다 쓰임
	public static final String SUB = "-";	// static은 리소스로 
	public static final String MUL = "*";
	public static final String DIV = "/";
	private static int COUNT = 0;

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}


	private void Algorithm() {
		System.out.println("알고리즘 수행");
	}

	public void Calculator() {

		Algorithm();

		switch (symbol) {
		case ADD:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case SUB:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case MUL:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case DIV:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default:
			break;

		}
		System.out.println("연산횟수 : " + ++COUNT);

	}

}
