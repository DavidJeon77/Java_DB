package pkg_calc;

public interface ICalculatorMode {
	
	void monadic(double num, int mode);
	void binomial(double num1, double num2, int mode);
	void printMonadic();
	void printBinomial();
	
}