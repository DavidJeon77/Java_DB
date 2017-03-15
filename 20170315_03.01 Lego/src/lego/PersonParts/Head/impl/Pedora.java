package lego.PersonParts.Head.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Head.IHead;

public class Pedora implements IHead {

	@Override
	public void head(LegoPersonParts head) {
		LegoPersonParts pedora = new LegoPersonParts() {

			@Override
			public String item() {
				return "페도라";
			}

			@Override
			public String color() {
				return "검정";
			}

			@Override
			public String brand() {
				return "ZARA";
			}
		};
	}

}
