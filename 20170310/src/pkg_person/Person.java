package pkg_person;

public class Person {

	private String name;
	private String companyOrSchool;
	private String methodOfCommute;

	public void setName(String name) {
		this.name = name;
	}

	public void setCompanyOrSchool(String companyOrSchool) {
		this.companyOrSchool = companyOrSchool;
	}

	public void setMethodOfCommute(String methodOfCommute) {
		this.methodOfCommute = methodOfCommute;
	}

	public void howToEat() {
	}

	public void whatToDo() {
	}

	public void printInfo() {
		System.out.println("[�̸�] : " + name + " [����] : " + companyOrSchool
				+ " [��ټ���] : " + methodOfCommute);

	}

	public void commuteMethod() {

	}

}
