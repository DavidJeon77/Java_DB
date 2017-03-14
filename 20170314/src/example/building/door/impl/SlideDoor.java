package example.building.door.impl;

import example.building.door.IDoor;

public class SlideDoor implements IDoor {

	@Override
	public void openDoor() {
		System.out.println("문을 옆으로 밀어서 열기");
	}

	@Override
	public void closeDoor() {
		System.out.println("문을 옆으로 밀어서 닫기");
	}

}
