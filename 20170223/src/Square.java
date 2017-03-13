public class Square {
	
	private int width;
	private int height;
	private int squareArea;
	
	public Square(int width, int Height){
		this.width = width;
		this.height = height;
		
		
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return squareArea;
	}

	public void squareShowInfo() {
		System.out.println(width);
		System.out.println(height);
	}

	public void squareRunApp() {
		squareArea = width * height;
		System.out.println("square : " + squareArea);
		System.out.println();
		squareShowInfo();
	}
	
	

}
