package example_class2;

public class Circle extends Shape {

	private int r;

	public Circle(int r) {
		this.r = r;
	}

	// 재정의 구현
	@Override
	public void makeArea() {
		area = Math.pow(r, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle = " + (r * r * Math.PI);
	}

}
