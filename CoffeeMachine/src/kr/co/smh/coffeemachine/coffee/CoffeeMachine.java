package kr.co.smh.coffeemachine.coffee;

public class CoffeeMachine {

	private IMakeCoffee coffeeMaker;
	
	public CoffeeMachine(IMakeCoffee coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
	}

	public void order(Coffee coffee) {
		coffeeMaker.makeCoffe(coffee);
	}
}
