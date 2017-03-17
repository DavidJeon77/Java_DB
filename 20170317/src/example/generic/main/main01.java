package example.generic.main;

import example.generic.classes.generic.Apple;
import example.generic.classes.generic.FruitBox;
import example.generic.classes.generic.Orenge;

public class main01 {

	public static void main(String[] args) {

		FruitBox fruitBox = new FruitBox();

		fruitBox.putFruit(new Apple());
		Apple apple = (Apple) fruitBox.getFruit();

		apple.foo();

		System.out.println("get : " + apple);

		fruitBox.putFruit(new Orenge());
		Orenge orenge = (Orenge) fruitBox.getFruit();

		orenge.goo();

		System.out.println("get : " + orenge);

	}

}
