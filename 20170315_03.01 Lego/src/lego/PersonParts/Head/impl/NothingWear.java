package lego.PersonParts.Head.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Head.IHead;

public class NothingWear implements IHead {

	@Override
	public void head(LegoPersonParts head) {
		LegoPersonParts nothingWear = new LegoPersonParts() {

			@Override
			public String item() {
				return "�ƹ��͵� �Ⱦ�";
			}

			@Override
			public String color() {
				return "�ƹ��͵� �Ⱦ�";
			}

			@Override
			public String brand() {
				return "�ƹ��͵� �Ⱦ�";
			}
		};
	}

}
