package shapeCalculator;

public class Circle {

	private int r;
	private double makeArea;
	private static int shapeConut = 0;

	// Circle ��ü ������ ���� �Ű������� r �� ����
	public Circle(int r) {
		this.r = r;
	}

	private void MakeArea() {
		makeArea = this.r * this.r * Math.PI;
	}

	private void printInfo() {
		System.out.println("[��] ������ : " + r + " ���� : " + makeArea);
		System.out.println("���� " + ++shapeConut + " �� ����� �����ϴ�. \n");
	}

	public void showInfo() {
		MakeArea();
		printInfo();
	}

}
