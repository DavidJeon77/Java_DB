package kr.co.smh.coffeemachine.coffee;

public class CaffeLatte extends Coffee{

	public CaffeLatte(String espresso, String liquid_kind, int liquid_ml, int sugar, int syrup) {
		super(espresso, liquid_kind, liquid_ml, sugar, syrup);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffeeWay() {
		System.out.println(super.toString());
		System.out.println("를 이용하여 카페라떼 제작");
	}

}
