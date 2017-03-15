package lego.PersonParts.Head.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Head.IHead;

public class NothingWear implements IHead {

	@Override
	public void head(LegoPersonParts head) {
		LegoPersonParts nothingWear = new LegoPersonParts() {

			@Override
			public String item() {
				return "아무것도 안씀";
			}

			@Override
			public String color() {
				return "아무것도 안씀";
			}

			@Override
			public String brand() {
				return "아무것도 안씀";
			}
		};
	}

}
