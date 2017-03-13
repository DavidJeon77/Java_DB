package shapeCalculator;

public class Rectangle {

	private int width;
	private int height;
	private double makeArea;
	private static int shapeConut = 0;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	private void MakeArea() {
		makeArea = width * height;
	}

	public void printInfo() {
		System.out.println("[사각형] 가로: " + width + "세로: " + height + " 넓이 : "
				+ makeArea);
		System.out.println("사각형이 " + ++shapeConut + " 개 만들어 졌습니다. \n");
	}

	public void showInfo() {
		MakeArea();
		printInfo();
	}

}
