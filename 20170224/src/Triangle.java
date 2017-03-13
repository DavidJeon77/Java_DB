public class Triangle extends Shape {
	private double width;
	private double height;

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;

	}
	@Override
	protected void makeArea() {
		super.makeArea();
		super.area = this.height * this.width / 2;

	}
	@Override
	public void showShapeInfo() {
		makeArea();
		System.out.println("width : " + this.width);
		System.out.println("height : " + this.height);
		System.out.println("area : " + super.area);
		
	}
	
	
	
	
	

}
