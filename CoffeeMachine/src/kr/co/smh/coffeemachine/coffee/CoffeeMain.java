package kr.co.smh.coffeemachine.coffee;

public class CoffeeMain {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine = new CoffeeMachine(new BitCoffeeMaker());
		
		coffeeMachine.order(new Americano("", "물", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new CaffeLatte("50", "우유", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new VanillaLatte("50", "우유 바닐라", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new Mocachino("50", "초코 우유", 20, 10, 30));
		
		System.out.println();
		
		CoffeeMachine aCoffeeMachine = new CoffeeMachine(new ACoffeMaker());
		aCoffeeMachine.order(new CaffeLatte("10", "우유", 30, 10, 10));
		
		
		
		
		
	}
	
}
