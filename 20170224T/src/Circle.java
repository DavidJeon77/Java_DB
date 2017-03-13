
public class Circle extends Shape{

	private int r;
	public Circle(int r){
		//super();
		this.r = r;
	}
	
	//오버라이딩의 조건
	//1) 반환형, 메소드명, 매개변수가 부모의 메소드와 완벽히 일치 해야 한다.
	//2) 접근지시 제어자는 부모의 것보다 넓거나 같아야 한다.
	
	protected void makeArea(){
		super.makeArea();//부모의 메소드 호출(super.메소드명)
		//super.area = this.r * this.r * 3.14;
		super.area = Math.pow(this.r, 2) * Math.PI;
	}
		
	public void showShapeInfo(){
		//넓이 구하기
		makeArea();
		System.out.println("반지름 : " + this.r);
		System.out.println("넓   이 : " + super.area);
	}
	
	
	//Object 클래스에 정의된 toString() 오버라이딩
	// => Object 클래스에서 객체를 표현하는 방식(패키지명.클래스@메모리 주소값)이 아닌
	//    해당 클래스의 정보를 마음대로 기입 할 수 있게 해 준다.
	//    보통은 멤버 변수의 값을 확인하는 용도로 사용함.
	
	@Override
	public String toString() {
		//return super.toString();	//부모의 toString을 실행 후 리턴
									//클래스@메모리 주소값
		
		return "[반지름 : " + this.r + " ]" + "[넓  이 : " + super.area + " ]" ;
		
	}
	
	public void rolling(){
		System.out.println("원이 굴러간다.");
	}
	
	
	
	
	
	
	
	
	
}
