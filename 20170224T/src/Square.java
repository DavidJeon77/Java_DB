
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
		System.out.println("���� : " + this.width);
		System.out.println("���� : " + this.height);
		System.out.println("���� : " + super.area);
	}
	
	public void stack(){
		System.out.println("�簢���� �״´�.");
	}
	




}
