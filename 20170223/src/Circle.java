public class Circle {

	private double r;
	private double circleArea;
	
	public Circle(int r){
		this.r = r;
	}

	public double getCircleArea() {
		return circleArea;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public void circleShowInfo(){
		System.out.println(r);
	}
	
	public void circleRunApp(){
		circleArea=r*r*3.14;
		System.out.println("circle : "+circleArea);
		System.out.println();
		circleShowInfo();
	}
	
	
	
	

	

}
