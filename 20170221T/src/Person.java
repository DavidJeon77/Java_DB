//class Ŭ������
// Ŭ�������� �ձ��ڴ� �׻� �빮�ڷ� �����.
public class Person {
	// 1) Person���� ����� �����͸� ����
	int age; // �̸�
	String name; // ����
	String job; // ����

	// 2) Person���� ����� ��� ����

	// ���� ���� �޼ҵ��̸� ( �Ű����� ){
	// ȣ�� �� ������ ���
	// ...
	// }
	void printPersonInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + job);
		System.out.println();
	}

	// changeJob �޼ҵ带 ȣ���ϱ� ���ؼ��� �Ű������� String ���·� �־� �־�� �Ѵ�.
	void changeJob(String changeJob) {
		System.out.println("���� �ٲٱ�");
		job = changeJob;
		System.out.println();
	}

	// getAge()�� ȣ�� �ϰ� �Ǹ� int�� ���� ���´�.
	int getAge() {
		return age;
	}
	

	// changeName �޼ҵ带 ȣ�� �� ��
	// String ������ �Ű������� �־�� �ϰ�
	// ȣ�� �ÿ� String ���·� ���� �޾� �� ���� �ִ�.
	String changeName(String changeName) {
		name = changeName;
		return name;
	}

}
