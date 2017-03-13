package pkg_person;

public class PersonMain {

	public static void main(String[] args) {

		Worker worker = new Worker();
		worker.setName("나직딩");
		worker.setCompanyOrSchool("Bit Inc.");
		worker.setMethodOfCommute("지하철");

		Student student = new Student();
		student.setName("나고딩");
		student.setCompanyOrSchool("비트고등학교");
		student.setMethodOfCommute("마을버스");

		worker.howToEat();
		worker.whatToDo();
		worker.printInfo();
		worker.commuteMethod();
		System.out.println();

		student.howToEat();
		student.whatToDo();
		student.printInfo();
		student.commuteMethod();

	}

}
