
public class House {
	
	//��
	// �����̵� ����
	// 1�ܰ� ����
	// House Ŭ������ SlideDoor Ŭ������ ������ �ִ�. ('House' has - a 'Slidedoor')
	private SlideDoor slideDoor;
	private HingedDoor hingedDoor;
	
	
	
	public House(){
		slideDoor = new SlideDoor();
		hingedDoor = new HingedDoor();
	}
	public void in(){
		slideDoor.openDoor();
		System.out.println("���� ����");
	}
	public void out(){
		System.out.println("������ ����");
		slideDoor.closeDoor();
		
	}
	
	public void in2(){
		hingedDoor.openDoor();
		System.out.println("���� ����");
	}
	public void out2(){
		System.out.println("������ ����");
		hingedDoor.closeDoor();
		
	}
	
	
	
	
}
