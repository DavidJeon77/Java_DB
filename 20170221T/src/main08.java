public class main08 {

	public static void main(String[] args) {
		// Ŭ������ �̿��� ��ü �����
		// ��ü�� ���� ���� new Ű���带 Ȱ���Ѵ�.
		Person p1 = new Person();

		// ��ü �ȿ� �ִ� �޼ҵ� ����ϱ�

		// ��ü��.�޼ҵ��̸�(�Ű�����)
		// ��ü��.�����̸�

		p1.age = 10;
		p1.name = "AA";
		p1.job = "�ʵ��л�";

		p1.printPersonInfo();

		// changeJob �޼ҵ�� String ������ �Ű������� �䱸
		p1.changeJob("���л�");
		// p1.changeJob(); //�Ű������� ���� ������ ���� �߻�
		// p1.changeJob(10); //String �Ű������� �־�� �ϴµ� ������ �Ű������� �ְ� �ֱ� ������ ����

		// �Լ� ȣ���� ������� ���ϰ��� �޾Ƽ� ������ ���� �� �� �ִ�.
		int pAge = p1.getAge();

		System.out.println("p1�� ���� : " + pAge);

		// changeName ȣ��ÿ� String ������ �Ű������� ����
		// ȣ���� �Ϸ� �Ǹ� String ������ ���ϰ����� �޾� �� �� �ִ�.
		String pName = p1.changeName("BBB");
		System.out.println(pName);

	}

}
