package example_class;

public class Person {

	// 1) Ŭ������ ���鶧�� �׻� ������ ����
	// => ������� ���� ������
	private int age = 10;
	private String name = "A";
	private String job = "B";

	// 1-2) ��� ������ ���� getter / setter ����
	// => ��� Ŭ������ ��������� private ���·� ���ǰ� �Ǿ�� �ϱ� ������(��������)
	// ���ο����� ���� �� ���� ��.

	// �ʿ信 ���� �ܺο��� ��������� ������ �ϰ��� getter�� setter�� ���� �Ѵ�.
	// getter : �ܺο��� �����͸� �������� ���
	// setter : �ܺο��� �����͸� �Է´�� �����ϴ� ���

	// getter / setter�� �̿������ν� �ܺο��� ��������� ���� ������ ���� �� �� �ִ�.
	// ��������� ���� ������ ���Ը� �ϰ� �ʹ� => getter�� ����
	// ��������� ���� ���ø� �ϰ� �ϰ� �ʹ� => setter�� ����
	// ��������� ���� ������ �� ���� �ְ�,���õ� �ϰ� �ϰ� �ʹ� => getter / setter ����

	// ��� getter / setter�� public���� ���� �Ǿ� ����.

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 2) �޼ҵ�(���) �� ���� ����
	// �޼ҵ� ���ڸ��� �ݵ�� �ҹ��ڷ� �����ؾ� �Ѵ�.

	

	// 1) �Ű����� X ���ϰ� X
	public void printPersonInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(job);
	}

	// 2) �Ű����� O ���ϰ� X
	public void changePersonAge(int _age) {
		age = _age;
		System.out.println("���̰� ���� �Ǿ����ϴ�.");
	}

	// 3) �Ű����� X ���ϰ� O
	public String getPersonName() {
		return name;
	}

	// 4) �Ű����� O ���ϰ� O
	public String changeJob(String _job) {
		job = _job;
		System.out.println("������ ���� �Ǿ����ϴ�.");
		return _job;
	}

}
