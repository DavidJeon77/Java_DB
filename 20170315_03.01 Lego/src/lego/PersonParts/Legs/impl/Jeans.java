package lego.PersonParts.Legs.impl;

import lego.PersonParts.Legs.ILegs;

public class Jeans implements ILegs {

	@Override
	public String item() {
		return "청바지";
	}

	@Override
	public String color() {
		return "청색";
	}

	@Override
	public String brand() {
		return "리바이스";
	}

}
