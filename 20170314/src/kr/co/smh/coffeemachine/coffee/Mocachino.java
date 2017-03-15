package kr.co.smh.coffeemachine.coffee;

public class Mocachino extends Coffee{

	public Mocachino(String espresso, String liquid_kind, int liquid_ml, int sugar, int syrup) {
		super(espresso, liquid_kind, liquid_ml, sugar, syrup);
	}

	@Override
	public void makeCoffeeWay() {
		System.out.println(super.toString());
		System.out.println(" 를 이용하여 모카치노 만들기");
	}
	
	

}
