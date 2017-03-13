public class Square extends Shape {
	private int width;
	private int height;

	public Square(int width, int height) {
		this.width = width;
		this.height = height;

	}

	@Override
	protected void makeArea() {
		super.makeArea();
		super.area = this.height * this.width;
	}

	public void showShapeInfo() {
		makeArea();
		System.out.println("width : " + this.width);
		System.out.println("height : " + this.height);
		System.out.println("area : " + super.area);

	}
	
	public void stack(){
		System.out.println("Stack ~~");
	}
	
	
	

}
