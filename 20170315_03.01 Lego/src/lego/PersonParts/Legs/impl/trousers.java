package lego.PersonParts.Legs.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Legs.ILegs;

public class trousers implements ILegs {

	@Override
	public void legs(LegoPersonParts legs) {
		LegoPersonParts trousers = new LegoPersonParts() {

			@Override
			public String item() {
				return "Ʈ�����";
			}

			@Override
			public String color() {
				return "���̺�";
			}

			@Override
			public String brand() {
				return "����";
			}
		};

	}

}
