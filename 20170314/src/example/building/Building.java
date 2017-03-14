package example.building;

import example.building.door.IDoor;

public class Building {

	private IDoor door;

	public Building(IDoor door) {
		this.door = door;
	}

	public void in() {

		System.out.println("신원 확인");
		System.out.println("보안 확인");

		door.openDoor();

	}

	public void out() {
		System.out.println("사람 나갈때 보안확인");
		door.closeDoor();
	}

}
