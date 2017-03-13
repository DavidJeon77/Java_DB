package pkg_person;

public class Worker extends Person {

	@Override
	public void howToEat() {
		System.out.println("점심은 한식부페 사먹음");
	}

	@Override
	public void whatToDo() {
		System.out.println("하는 일은 프로그래밍");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		checkSalery();
	}

	@Override
	public void commuteMethod() {
		System.out.println("정자역에서 신분당선타고 강남역으로 출근");
	}

	private void checkSalery() {
		System.out.println("월급 : 250만원");
	}

}
