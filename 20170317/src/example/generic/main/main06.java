package example.generic.main;

import java.util.ArrayList;
import java.util.Iterator;

import example.generic.classes.Person.Person;

public class main06 {
	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("A", 10));
		personList.add(new Person("B", 20));
		personList.add(new Person("C", 30));
		personList.add(new Person("D", 40));

		Iterator<Person> personIt = personList.iterator();

		while (personIt.hasNext()) {
			Person temp = personIt.next();

			if (temp.getName().equals("A")) {
				personIt.remove();
			}

		}
		System.out.println(personList);

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i));
			System.out.println();
			System.out.println();
			System.out.println();
		}

		// ��üŽ���� �� ���� �ε������� for each���� Ȱ�� �ϴ� ���� ����.
		// *Ư�� LinkedList������ Ž���� �ε����� �ƴ� for each �Ǵ� Iterator�� �̿� ����
		for (Person p : personList) {
			System.out.println(p);
		}

	}

}
