package lego.PersonParts.arms.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.arms.IArm;

public class gun implements IArm {

	@Override
	public void arms(LegoPersonParts arm) {

		LegoPersonParts gun = new LegoPersonParts() {

			@Override
			public String item() {
				return "��";
			}

			@Override
			public String color() {
				return "�ѻ�";
			}

			@Override
			public String brand() {
				return "������";
			}
		};
	}

}
