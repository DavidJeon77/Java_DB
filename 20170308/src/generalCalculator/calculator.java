package generalCalculator;

public class calculator {

	private int num1;
	private int num2;
	private String symbol;

	public static final String ADD = "+";	// private�� �ƴ� public���� ���� Ŭ������ ���� ���ο��� �� ����
	public static final String SUB = "-";	// static�� ���ҽ��� 
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
		System.out.println("�˰��� ����");
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
		System.out.println("����Ƚ�� : " + ++COUNT);

	}

}
