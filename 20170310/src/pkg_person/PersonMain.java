package pkg_person;

public class PersonMain {

	public static void main(String[] args) {

		Worker worker = new Worker();
		worker.setName("������");
		worker.setCompanyOrSchool("Bit Inc.");
		worker.setMethodOfCommute("����ö");

		Student student = new Student();
		student.setName("�����");
		student.setCompanyOrSchool("��Ʈ����б�");
		student.setMethodOfCommute("��������");

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
