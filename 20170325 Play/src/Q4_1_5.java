
public class Q4_1_5 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;

		a = ((25 + 5) + (36 / 4) - 72) * 5;
		b = ((25 * 5) + (36 - 4) + 71) / 4;
		c = (128 / 4) * 2;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);

		boolean result1 = (a > b && b > c);
		System.out.println(result1);

	}
}
