package example_class2;

public class Square extends Shape {

	private int width;
	private int height;

	public Square(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void makeArea() {
		area = width * height;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", height=" + height + ", area=" + area;

	}

}
