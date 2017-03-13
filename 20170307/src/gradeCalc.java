public class gradeCalc {

	public static void main(String[] args) {

		int score = 99;

		if (score < 0 || score > 100) {
			System.out.println("Wrong Number");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}
}
