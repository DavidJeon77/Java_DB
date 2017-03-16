package kr.co.smh.coffeemachine.coffee;

public class BitCoffeeMaker implements IMakeCoffee {

	@Override
	public void makeCoffe(Coffee coffee) {
		System.out.println("BitCoffeeMaker로 커피 만들기");
		coffee.makeCoffeeWay();
	}

}
