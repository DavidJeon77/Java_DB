package lego.PersonParts.Legs.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Legs.ILegs;

public class Skirt implements ILegs {

	@Override
	public void legs(LegoPersonParts legs) {
		LegoPersonParts Skirt = new LegoPersonParts() {

			@Override
			public String item() {
				return "치마";
			}

			@Override
			public String color() {
				return "검정";
			}

			@Override
			public String brand() {
				return "자라";
			}
		};

	}

}
