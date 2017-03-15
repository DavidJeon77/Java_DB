package lego.PersonParts.arms.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.arms.IArm;

public class Knife implements IArm {

	@Override
	public void arms(LegoPersonParts arm) {
		LegoPersonParts knife = new LegoPersonParts() {

			@Override
			public String item() {
				return "칼";
			}

			@Override
			public String color() {
				return "검은색";
			}

			@Override
			public String brand() {
				return "대장간";
			}
		};
	}

}
