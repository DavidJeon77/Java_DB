package pkg_animal;

public class Monkey extends omnivore {

	@Override
	public void eating() {
		System.out.println("�����̰� ���� �Դ´�.");
		super.eating();
	}

	@Override
	public void running() {
		System.out.println("�ڴ�");
		super.running();
	}
}
