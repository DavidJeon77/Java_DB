package lego.PersonParts.Legs.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Legs.ILegs;

public class Skirt implements ILegs {

	@Override
	public void legs(LegoPersonParts legs) {
		LegoPersonParts Skirt = new LegoPersonParts() {

			@Override
			public String item() {
				return "ġ��";
			}

			@Override
			public String color() {
				return "����";
			}

			@Override
			public String brand() {
				return "�ڶ�";
			}
		};

	}

}
