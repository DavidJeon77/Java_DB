package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Dress implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts dress = new LegoPersonParts() {

			@Override
			public String item() {
				return "�巹��";
			}

			@Override
			public String color() {
				return "ȭ��Ʈ";
			}

			@Override
			public String brand() {
				return "����";
			}
		};

	}

}
