package lego.PersonParts.arms.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.arms.IArm;

public class Stick implements IArm {

	@Override
	public void arms(LegoPersonParts arm) {
		LegoPersonParts Stick = new LegoPersonParts() {

			@Override
			public String item() {
				return "�����";
			}

			@Override
			public String color() {
				return "������";
			}

			@Override
			public String brand() {
				return "�޻�";
			}
		};

	}

}
