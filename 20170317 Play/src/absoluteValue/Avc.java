package absoluteValue;

public class Avc {

	int num1;
	int num2;
	int result;

	public void AvcPrintInfo() {
//		result = ((num1 - num2) * -1);
		result = Math.abs(num1 - num2);
		System.out.println(result);
	}

}
