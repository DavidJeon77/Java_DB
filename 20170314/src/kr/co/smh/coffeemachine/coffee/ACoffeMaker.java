package kr.co.smh.coffeemachine.coffee;

public class ACoffeMaker implements IMakeCoffee{

	@Override
	public void makeCoffe(Coffee coffee) {
		System.out.println("A Coffee ���� Ŀ�� ����");
		coffee.makeCoffeeWay();
	}
	

}
