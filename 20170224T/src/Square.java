
public class Square extends Shape{

	private int width;
	private int height;
	
	public Square(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected void makeArea() {
		super.makeArea();
		area = width * height;
	}
	
//	@Override
//	protected void makeArea() {
//		// TODO Auto-generated method stub
//		super.makeArea();
//	}

	@Override
	public void showShapeInfo() {
		makeArea();
		System.out.println("가로 : " + this.width);
		System.out.println("세로 : " + this.height);
		System.out.println("넓이 : " + super.area);
	}
	
	public void stack(){
		System.out.println("사각형을 쌓는다.");
	}
	




}
