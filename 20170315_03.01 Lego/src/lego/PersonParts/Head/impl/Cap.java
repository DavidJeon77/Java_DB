package lego.PersonParts.Head.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Head.IHead;

public class Cap implements IHead {

	@Override
	public void head(LegoPersonParts head) {
		LegoPersonParts cap = new LegoPersonParts() {

			@Override
			public String item() {
				return "�߱�����";
			}

			@Override
			public String color() {
				return "����";
			}

			@Override
			public String brand() {
				return "MLB";
			}
		};

	}

}
