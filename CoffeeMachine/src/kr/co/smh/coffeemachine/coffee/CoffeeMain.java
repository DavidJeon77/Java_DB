package kr.co.smh.coffeemachine.coffee;

public class CoffeeMain {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine = new CoffeeMachine(new BitCoffeeMaker());
		
		coffeeMachine.order(new Americano("", "��", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new CaffeLatte("50", "����", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new VanillaLatte("50", "���� �ٴҶ�", 10, 10, 10));
		System.out.println();
		coffeeMachine.order(new Mocachino("50", "���� ����", 20, 10, 30));
		
		System.out.println();
		
		CoffeeMachine aCoffeeMachine = new CoffeeMachine(new ACoffeMaker());
		aCoffeeMachine.order(new CaffeLatte("10", "����", 30, 10, 10));
		
		
		
		
		
	}
	
}
