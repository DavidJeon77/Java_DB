package lego.PersonParts.Legs.impl;

import lego.PersonParts.Legs.ILegs;

public class Skirt implements ILegs {

	@Override
	public String item() {
		return "치마";
	}

	@Override
	public String color() {
		return "검은색";
	}

	@Override
	public String brand() {
		return "자라";
	}

}
