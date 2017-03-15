package lego.PersonParts.arms.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.arms.IArm;

public class Knife implements IArm {

	@Override
	public void arms(LegoPersonParts arm) {
		LegoPersonParts knife = new LegoPersonParts() {

			@Override
			public String item() {
				return "Į";
			}

			@Override
			public String color() {
				return "������";
			}

			@Override
			public String brand() {
				return "���尣";
			}
		};
	}

}
