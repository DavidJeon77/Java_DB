package pkg_calc;

public class Calculator implements ICalculatorMode{

	private ICalculatorMode calcMode = null;

	public void setCalcMode(ICalculatorMode calcMode){
		this.calcMode = calcMode;
	}

	@Override
	public void monadic(double num, int mode) {
		calcMode.monadic(num, mode);
	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		calcMode.binomial(num1, num2, mode);
	}

	@Override
	public void printMonadic() {
		calcMode.printMonadic();
	}

	@Override
	public void printBinomial() {
		calcMode.printBinomial();
	}

}
