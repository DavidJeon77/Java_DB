package pkg_person;

public class Student extends Person {

	@Override
	public void howToEat() {
		System.out.println("���ɽð� �ѽð����� ���ö� �����");
	}

	@Override
	public void whatToDo() {
		System.out.println("�ϴ� ���� ���� ? ");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		checkGrade();
	}

	@Override
	public void commuteMethod() {
		System.out.println("�̱ݿ����� �������� 5-1���� Ÿ�� �б��� �");
	}

	private void checkGrade() {
		System.out.println("���� : A");
	}

}
