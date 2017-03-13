public class mainCal {

	public static void main(String[] args) {

		// 사각형
		Square square = new Square();
		square.setHeight(30);
		square.setWidth(20);
		
		square.squareRunApp();
		
		System.out.println();
		
		
		// 원
		Circle circle = new Circle();
		circle.setR(5);
		
		circle.circleRunApp();
		
		
		
		

	}

}
