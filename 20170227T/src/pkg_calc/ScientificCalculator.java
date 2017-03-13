package pkg_calc;

public class ScientificCalculator implements ICalculatorMode{

	private double result = 0;
	
	public static final int MONADIC_SIN = 1;
	public static final int MONADIC_COS = 2;
	public static final int MONADIC_TAN = 3;
	public static final int MONADIC_FCT = 4;
	
	public static final int BINOMIAL_YROOT = 1;
	public static final int BINOMIAL_MOD = 2;
	
	@Override
	public void monadic(double num, int mode) {
		switch(mode){
		case MONADIC_SIN:
			result = Math.sin(Math.toRadians(num));
			break;
		case MONADIC_COS:
			result = Math.cos(Math.toRadians(num));
			break;
		case MONADIC_TAN:
			result = Math.tan(Math.toRadians(num));
			break;
		case MONADIC_FCT:
			System.out.println("Factorial 연산은 자동으로 정수화 되어서 계산 됩니다.");
			result = 1;
			for(int i = (int)num; i > 0; i--){
				result *= i;
			}
			break;
		}
		System.out.println("결과 : " + result);

	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		switch(mode){
		case BINOMIAL_YROOT:
			result = num1 * Math.sqrt(num2);
			break;
		case BINOMIAL_MOD:
			result = num1 % num2;
			break;
		}
		
		System.out.println("결과 : " + result);
	}

	@Override
	public void printMonadic() {
		System.out.println("------------------");
		System.out.println("[1]sin(x)\t- sin연산");
		System.out.println("[2]cos(x)\t- cos연산");
		System.out.println("[3]tan(x)\t- tan연산");
		System.out.println("[4]!n\t- (n)Factorial 연산");
		System.out.println("------------------");
	}

	@Override
	public void printBinomial() {
		System.out.println("------------------");
		System.out.println("[1]yroot\t- y Root X 연산");
		System.out.println("[2]mod\t- x % y 연산");
		System.out.println("------------------");
	}

}
