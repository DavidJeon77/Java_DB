package kr.co.smh.coffeemachine.coffee;

public class BitCoffeeMaker implements IMakeCoffee {

	@Override
	public void makeCoffe(Coffee coffee) {
		System.out.println("BitCoffeeMaker�� Ŀ�� �����");
		coffee.makeCoffeeWay();
	}

}
