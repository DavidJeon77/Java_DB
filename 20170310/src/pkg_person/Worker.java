package pkg_person;

public class Worker extends Person {

	@Override
	public void howToEat() {
		System.out.println("������ �ѽĺ��� �����");
	}

	@Override
	public void whatToDo() {
		System.out.println("�ϴ� ���� ���α׷���");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		checkSalery();
	}

	@Override
	public void commuteMethod() {
		System.out.println("���ڿ����� �źд缱Ÿ�� ���������� ���");
	}

	private void checkSalery() {
		System.out.println("���� : 250����");
	}

}
