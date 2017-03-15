package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Dress implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts dress = new LegoPersonParts() {

			@Override
			public String item() {
				return "드레스";
			}

			@Override
			public String color() {
				return "화이트";
			}

			@Override
			public String brand() {
				return "몰라";
			}
		};

	}

}
