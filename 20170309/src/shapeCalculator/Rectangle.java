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
		System.out.println("[�簢��] ����: " + width + "����: " + height + " ���� : "
				+ makeArea);
		System.out.println("�簢���� " + ++shapeConut + " �� ����� �����ϴ�. \n");
	}

	public void showInfo() {
		MakeArea();
		printInfo();
	}

}
