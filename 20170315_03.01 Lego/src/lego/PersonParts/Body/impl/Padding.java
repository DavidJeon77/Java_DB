package lego.PersonParts.Body.impl;

import lego.PersonParts.LegoPersonParts;
import lego.PersonParts.Body.IBody;

public class Padding implements IBody {

	@Override
	public void body(LegoPersonParts body) {
		LegoPersonParts padding = new LegoPersonParts() {

			@Override
			public String item() {
				return "패딩";
			}

			@Override
			public String color() {
				return "녹색";
			}

			@Override
			public String brand() {
				return "아이더";
			}
		};

	}

}
