package lego.PersonParts.Head.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Head.IHead;

public class Cap implements IHead {

	@Override
	public void head(LegoPersonParts head) {
		LegoPersonParts cap = new LegoPersonParts() {

			@Override
			public String item() {
				return "야구모자";
			}

			@Override
			public String color() {
				return "빨강";
			}

			@Override
			public String brand() {
				return "MLB";
			}
		};

	}

}
