package lego.PersonParts.arms.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.arms.IArm;

public class gun implements IArm {

	@Override
	public void arms(LegoPersonParts arm) {

		LegoPersonParts gun = new LegoPersonParts() {

			@Override
			public String item() {
				return "ÃÑ";
			}

			@Override
			public String color() {
				return "ÃÑ»ö";
			}

			@Override
			public String brand() {
				return "ÃÑÆ÷»ç";
			}
		};
	}

}
