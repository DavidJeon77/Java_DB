package pkg_calc;

public class GeneralCalc implements ICalculatorMode{

	private double result = 0;
	
	
	public static final int MONADIC_LOG = 1;
	public static final int MONADIC_SQRT = 2;
	
	public static final int BINOMIAL_ADD = 1;
	public static final int BINOMIAL_SUB = 2;
	public static final int BINOMIAL_MUL = 3;
	public static final int BINOMIAL_DIV = 4;
	
	@Override
	public void monadic(double num, int mode) {
		switch(mode){
		case MONADIC_LOG:
			System.out.println("�α׿���");
			result = Math.log(num);
			break;
		case MONADIC_SQRT:
			result = Math.sqrt(num);
			break;
		}
		
		System.out.println("��� : " + result);
		
	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		switch(mode){
		case BINOMIAL_ADD:
			result = num1+num2;
			break;
		case BINOMIAL_SUB:
			result = num1-num2;
			break;
		case BINOMIAL_MUL:
			result = num1*num2;
			break;
		case BINOMIAL_DIV:
			result = num1/num2;
			break;
		}
		
		System.out.println("��� : " + result);
	}

	@Override
	public void printMonadic() {
		System.out.println("------------------");
		System.out.println("[1]log\t- �α׿���");
		System.out.println("[2]sqrt\t- ��������");
		System.out.println("------------------");
	}

	@Override
	public void printBinomial() {
		System.out.println("------------------");
		System.out.println("[1]add\t- ��������");
		System.out.println("[2]sub\t- ��������");
		System.out.println("[3]mul\t- ��������");
		System.out.println("[4]div\t- ����������");
		System.out.println("------------------");
	}

}
