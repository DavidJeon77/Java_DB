import example_class.Person;

public class main02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printPersonInfo();

		p1.setAge(30);
		p1.setName("EEE");
//		p1.setJob("RRR");

		int age = p1.getAge();
//		String name = p1.getName();
		String job = p1.getJob();

		System.out.println("age " + age);
//		System.out.println("name " + name);
		System.out.println("job " + job);

	}

}
