package shapeCalculator;

import java.util.Scanner;

public class shapeCalculatorMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// Circle ��ü ������ �Ű����� �� �ޱ�
		Circle circle1 = new Circle(3);
		Circle circle2 = new Circle(6);
		Circle circle3 = new Circle(9);
		
		circle1.showInfo();
		circle2.showInfo();
		circle3.showInfo();
		System.out.println();

		// Rectangle ��ü ������ �Ű����� �� �ޱ�
		Rectangle rectangle1 = new Rectangle(3, 4);
		Rectangle rectangle2 = new Rectangle(5, 6);
		Rectangle rectangle3 = new Rectangle(7, 8);

		rectangle1.showInfo();
		rectangle2.showInfo();
		rectangle3.showInfo();

	}

}
