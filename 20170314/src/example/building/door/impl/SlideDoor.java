package example.building.door.impl;

import example.building.door.IDoor;

public class SlideDoor implements IDoor {

	@Override
	public void openDoor() {
		System.out.println("���� ������ �о ����");
	}

	@Override
	public void closeDoor() {
		System.out.println("���� ������ �о �ݱ�");
	}

}
