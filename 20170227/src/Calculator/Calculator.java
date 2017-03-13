package Calculator;

public class Calculator implements IClaculator {

	private IClaculator calculatorMode;

	public void setCalculatorMode(IClaculator calculatorMode) {
		this.calculatorMode = calculatorMode;
	}

	@Override
	public void monadic(double monadicNum, int mode) {
		calculatorMode.monadic(monadicNum, mode);

	}

	@Override
	public void binomial(double binomialNum1, double binomialNum2, int mode) {
		calculatorMode.binomial(binomialNum1, binomialNum2, mode);

	}

	@Override
	public void printMonadic() {
		calculatorMode.printMonadic();

	}

	@Override
	public void printBinomial() {
		calculatorMode.printBinomial();

	}

}
