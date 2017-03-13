public class House2 {

	IDoor iDoor;

	public House2(IDoor iDoor) {
		this.iDoor = iDoor;
	}

	public void in() {
		iDoor.openDoor();
		System.out.println("get in the house");
	}

	public void out() {
		System.out.println("get out the house");
		iDoor.closeDoor();
	}

}
