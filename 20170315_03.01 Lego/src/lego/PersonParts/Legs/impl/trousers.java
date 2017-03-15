package lego.PersonParts.Legs.impl;

import lego.PersonParts.Legs.ILegs;

public class trousers implements ILegs {

	@Override
	public String item() {
		return "트라우져";
	}

	@Override
	public String color() {
		return "네이비색";
	}

	@Override
	public String brand() {
		return "폴로";
	}

}
