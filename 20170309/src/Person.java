public class Person {

	private final String JUMIN_NUMBER;
	private String name;

	// ��������� final ������ ������ ���� ��쿣 �����ڿ��� final ������ ���� �ʱ�ȭ�� å���� ����.
	public Person(String JUMIN_NUMBER, String name) {
		this.JUMIN_NUMBER = JUMIN_NUMBER;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJUMIN_NUMBER() {
		return JUMIN_NUMBER;
	}

	public void printPersonInfo() {
		System.out.println("name : " + this.name);
		System.out.println("JUMIN_NUM : " + this.JUMIN_NUMBER);
	}

}
