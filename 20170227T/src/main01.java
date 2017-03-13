
public class main01 {

	//회전문 : RevolvingDoor
	public static void main(String[] args) {
//		House house = new House();
//		house.in();
//		house.out();
		
		House2 slideHouse = new House2(new SlideDoor2()); 	//미닫이 문을 가진 집
		House2 hingedHouse = new House2(new HingedDoor2()); //여닫이 문을 가진 집
		House2 revolvingHouse = new House2(new RevolvingDoor());
		
		slideHouse.in();
		slideHouse.out();
		
		hingedHouse.in();
		hingedHouse.out();
		
		revolvingHouse.in();
		revolvingHouse.out();
		
	}
	
}


