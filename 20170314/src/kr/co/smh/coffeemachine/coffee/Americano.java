package kr.co.smh.coffeemachine.coffee;

public class Americano extends Coffee {

	public Americano(String espresso, String liquid_kind, int liquid_ml, int sugar, int syrup) {
		super(espresso, liquid_kind, liquid_ml, sugar, syrup);
	}

	@Override
	public void makeCoffeeWay() {
		String str = super.toString();
		System.out.println(str);
		System.out.println("를 이용하여 아메리카노 제작");
	}

}
