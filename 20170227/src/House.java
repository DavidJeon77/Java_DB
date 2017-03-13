
public class House {
	
	//문
	// 슬라이드 도어
	// 1단계 관계
	// House 클래스가 SlideDoor 클래스를 가지고 있다. ('House' has - a 'Slidedoor')
	private SlideDoor slideDoor;
	private HingedDoor hingedDoor;
	
	
	
	public House(){
		slideDoor = new SlideDoor();
		hingedDoor = new HingedDoor();
	}
	public void in(){
		slideDoor.openDoor();
		System.out.println("집에 들어옴");
	}
	public void out(){
		System.out.println("집에서 나감");
		slideDoor.closeDoor();
		
	}
	
	public void in2(){
		hingedDoor.openDoor();
		System.out.println("집에 들어옴");
	}
	public void out2(){
		System.out.println("집에서 나감");
		hingedDoor.closeDoor();
		
	}
	
	
	
	
}
