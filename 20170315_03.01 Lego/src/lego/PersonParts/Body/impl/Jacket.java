package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Jacket implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts jacket = new LegoPersonParts() {

			@Override
			public String item() {
				return "자켓";
			}

			@Override
			public String color() {
				return "갈색";
			}

			@Override
			public String brand() {
				return "몰라";
			}
		};

	}

}
