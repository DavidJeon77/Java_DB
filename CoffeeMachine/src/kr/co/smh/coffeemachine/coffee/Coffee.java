package kr.co.smh.coffeemachine.coffee;

public abstract class Coffee {

	protected String espresso;
	protected String liquid_kind;
	protected int liquid_ml;
	protected int sugar;
	protected int syrup;
	
	public static final int AMERICANO = 1;
	public static final int VANILALATTE = 2;
	public static final int CAFFELATTE = 3;
	
	public Coffee(String espresso, String liquid_kind, int liquid_ml, int sugar, int syrup){
		this.espresso = espresso;
		this.liquid_kind = liquid_kind;
		this.liquid_ml = liquid_ml;
		this.sugar = sugar;
		this.syrup = syrup;
	}
	
	public abstract void makeCoffeeWay();

	@Override
	public String toString() {
		return "Coffee [espresso=" + espresso + ", liquid_kind=" + liquid_kind + ", liquid_ml=" + liquid_ml + ", sugar="
				+ sugar + ", syrup=" + syrup + "]";
	}
	
	

}
