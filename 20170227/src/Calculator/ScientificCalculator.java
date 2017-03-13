package Calculator;

public class ScientificCalculator implements IClaculator {

	private double result = 0;

	public static final int MONADIC_COS = 1;
	public static final int MONADIC_SIN = 2;
	public static final int MONADIC_TAN = 3;
	public static final int MONADIC_FACTORIAL = 4;

	public static final int BINOMIC_YROOT = 1;
	public static final int BINOMIC_MOD = 2;

	@Override
	public void monadic(double monadicNum, int mode) {
		switch (mode) {
		case MONADIC_COS:
			System.out.println("COS");
			result = Math.cos(monadicNum);
			break;
		case MONADIC_SIN:
			System.out.println("SIN");
			result = Math.sin(monadicNum);
			break;
		case MONADIC_TAN:
			System.out.println("TAN");
			result = Math.tan(monadicNum);
			break;
		case MONADIC_FACTORIAL:
			System.out.println("FACTORIAL");
			long term = 1L;
			for (int i = 1; i < 21; i++) {
				term *= i;
				System.out.println(i + "! = " + term);
			}
			break;
		}
		System.out.println("result : " + result);

	}

	@Override
	public void binomial(double binomialNum1, double binomialNum2, int mode) {
		switch (mode) {
		case BINOMIC_YROOT:
			System.out.println("YROOT");
			result = binomialNum1 * Math.sqrt(binomialNum2);
			break;
		case BINOMIC_MOD:
			System.out.println("MOD");
			result = binomialNum1 % binomialNum2;
			break;
		}
		System.out.println("result : " + result);
	}

	@Override
	public void printMonadic() {
		System.out.println("[1] COS \n");
		System.out.println("[2] SIN \n");
		System.out.println("[3] TAN \n");
		System.out.println("[4] FACTORIAL \n");

	}

	@Override
	public void printBinomial() {
		System.out.println("[1] YROOT\n");
		System.out.println("[2] MOD \n");

	}

}
