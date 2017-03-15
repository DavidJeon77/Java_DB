package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Padding implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts padding = new LegoPersonParts() {

			@Override
			public String item() {
				return "�е�";
			}

			@Override
			public String color() {
				return "���";
			}

			@Override
			public String brand() {
				return "���̴�";
			}
		};

	}

}
