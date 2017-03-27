public class Q5_1_2 {
	public static void main(String[] args) {

		int num = 120;

		if (num < 0) {
			System.out.println("under 0");
		} else if (num >= 0 && num < 100) {
			System.out.println("from 0 to under 100");
		} else if (num >= 100 && num < 200) {
			System.out.println("from 100 to under 200");
		} else if (num >= 200 && num < 300) {
			System.out.println("from 200 to under 300");
		} else {
			System.out.println("over 300");
		}

	}
}
