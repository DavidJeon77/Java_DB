package example.generic.main;

import example.generic.classes.generic.Apple;
import example.generic.classes.generic.MyGeneric;
import example.generic.classes.generic.Orenge;

public class main03 {

	public static void main(String[] args) {

		MyGeneric<Apple, Orenge> myGeneric = new MyGeneric<>(new Apple(), new Orenge());

		String str = myGeneric.<String>foo("Hello");
		Apple apple = myGeneric.foo(new Apple());

		System.out.println(str);
		System.out.println(apple);

	}

}
