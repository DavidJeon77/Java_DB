package Calculator;

public class GeneralCalculator implements IClaculator {

	private double result = 0;

	public static final int MONADIC_SQRT = 1;
	public static final int MONADIC_LOG = 2;

	public static final int BINOMIC_ADD = 1;
	public static final int BINOMIC_SUB = 2;
	public static final int BINOMIC_MUL = 3;
	public static final int BINOMIC_DIV = 4;

	@Override
	public void monadic(double monadicNum, int mode) {
		switch (mode) {
		case MONADIC_SQRT:
			System.out.println("������ ����");
			result = Math.sqrt(monadicNum);
			break;
		case MONADIC_LOG:
			System.out.println("�α� ����");
			result = Math.log(monadicNum);
			break;
		}
		System.out.println("result : " + result);

	}

	@Override
	public void binomial(double binomialNum1, double binomialNum2, int mode) {
		switch (mode) {
		case BINOMIC_ADD:
			System.out.println("���� ����");
			result = binomialNum1 + binomialNum2;
			break;
		case BINOMIC_SUB:
			System.out.println("���� ����");
			result = binomialNum1 - binomialNum2;
			break;
		case BINOMIC_MUL:
			System.out.println("���� ����");
			result = binomialNum1 * binomialNum2;
			break;
		case BINOMIC_DIV:
			System.out.println("������ ����");
			result = binomialNum1 / binomialNum2;
			break;
		}
		System.out.println("result : " + result);

	}

	@Override
	public void printMonadic() {
		System.out.println("[1] sqrt \n");
		System.out.println("[2] log \n");

	}

	@Override
	public void printBinomial() {
		System.out.println("[1]add\n");
		System.out.println("[1]sub\n");
		System.out.println("[1]mul\n");
		System.out.println("[1]div\n");

	}

}
