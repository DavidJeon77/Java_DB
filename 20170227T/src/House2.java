
public class House2 {

	IDoor iDoor;
	public House2(IDoor iDoor){
		this.iDoor = iDoor;
	}
	
	public void in(){
		iDoor.openDoor();
		System.out.println("집에 들어감");
		
	}
	
	public void out(){
		System.out.println("집에서 나옴");
		iDoor.closeDoor();
	}
	
}
