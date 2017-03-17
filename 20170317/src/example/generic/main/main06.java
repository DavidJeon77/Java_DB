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

		// 전체탐색을 할 때는 인덱스보다 for each문을 활용 하는 것이 좋다.
		// *특히 LinkedList에서의 탐색은 인덱스가 아닌 for each 또는 Iterator를 이용 하자
		for (Person p : personList) {
			System.out.println(p);
		}

	}

}
