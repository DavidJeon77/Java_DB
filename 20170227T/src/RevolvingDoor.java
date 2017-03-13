
public class RevolvingDoor implements IDoor{

	@Override
	public void openDoor() {
		System.out.println("회전문 밀어서 열기");
	}

	@Override
	public void closeDoor() {
		System.out.println("회전문 밀어서 닫기");
		
	}

}
