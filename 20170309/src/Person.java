public class Person {

	private final String JUMIN_NUMBER;
	private String name;

	// 멤버변수에 final 형태의 변수가 있을 경우엔 생성자에서 final 변수에 대한 초기화의 책임을 진다.
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
