
public class main01 {

	//ȸ���� : RevolvingDoor
	public static void main(String[] args) {
//		House house = new House();
//		house.in();
//		house.out();
		
		House2 slideHouse = new House2(new SlideDoor2()); 	//�̴��� ���� ���� ��
		House2 hingedHouse = new House2(new HingedDoor2()); //������ ���� ���� ��
		House2 revolvingHouse = new House2(new RevolvingDoor());
		
		slideHouse.in();
		slideHouse.out();
		
		hingedHouse.in();
		hingedHouse.out();
		
		revolvingHouse.in();
		revolvingHouse.out();
		
	}
	
}


