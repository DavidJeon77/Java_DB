package shapeCalculator;

public class Circle {

	private int r;
	private double makeArea;
	private static int shapeConut = 0;

	// Circle 객체 생성시 받은 매개변수를 r 에 저장
	public Circle(int r) {
		this.r = r;
	}

	private void MakeArea() {
		makeArea = this.r * this.r * Math.PI;
	}

	private void printInfo() {
		System.out.println("[원] 반지름 : " + r + " 넓이 : " + makeArea);
		System.out.println("원이 " + ++shapeConut + " 개 만들어 졌습니다. \n");
	}

	public void showInfo() {
		MakeArea();
		printInfo();
	}

}
