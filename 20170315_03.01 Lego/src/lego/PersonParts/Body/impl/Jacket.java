package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Jacket implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts jacket = new LegoPersonParts() {

			@Override
			public String item() {
				return "����";
			}

			@Override
			public String color() {
				return "����";
			}

			@Override
			public String brand() {
				return "����";
			}
		};

	}

}
