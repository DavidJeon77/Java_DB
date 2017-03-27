package MethodReturn;

public class MethodReturnMain {
	public static void main(String[] args) {

		Square sq = new Square();
		Square sq2 = new Square();
		System.out.println(Adder.adder(4, 5));
		System.out.println(sq.square(5));

		sq.num2 = 3;
		System.out.println(sq.num2);
		
		System.out.println(sq2.num2);
		
		
	}

}
