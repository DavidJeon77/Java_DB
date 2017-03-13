package pkg_person;

public class Student extends Person {

	@Override
	public void howToEat() {
		System.out.println("점심시간 한시간전에 도시락 까먹음");
	}

	@Override
	public void whatToDo() {
		System.out.println("하는 일은 공부 ? ");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		checkGrade();
	}

	@Override
	public void commuteMethod() {
		System.out.println("미금역에서 마을버스 5-1번을 타고 학교로 등교");
	}

	private void checkGrade() {
		System.out.println("성적 : A");
	}

}
