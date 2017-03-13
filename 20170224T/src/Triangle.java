
public class Triangle extends Shape{

	private int width;
	private int height;
	
	public Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected void makeArea() {
		super.makeArea();
		super.area = this.width * this.height / 2;
	}
	
	@Override
	public void showShapeInfo() {
		makeArea();
		System.out.println("πÿ∫Ø : " + this.width);
		System.out.println("≥Ù¿Ã : " + this.height);
		System.out.println("≥–¿Ã : " + super.area);
	}

}
