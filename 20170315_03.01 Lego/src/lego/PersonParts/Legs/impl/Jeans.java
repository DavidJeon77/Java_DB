package lego.PersonParts.Legs.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Legs.ILegs;

public class Jeans implements ILegs {

	@Override
	public void legs(LegoPersonParts legs) {
		LegoPersonParts Jeans = new LegoPersonParts() {

			@Override
			public String item() {
				return "û����";
			}

			@Override
			public String color() {
				return "û��";
			}

			@Override
			public String brand() {
				return "�����̽�";
			}
		};

	}

}
