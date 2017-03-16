package kr.co.smh.coffeemachine.coffee;

public class VanillaLatte extends Coffee{

	public VanillaLatte(String espresso, String liquid_kind, int liquid_ml, int sugar, int syrup) {
		super(espresso, liquid_kind, liquid_ml, sugar, syrup);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffeeWay() {
		System.out.println(super.toString());
		System.out.println("을 이용하여 바닐라라떼 제작");
	}

}
