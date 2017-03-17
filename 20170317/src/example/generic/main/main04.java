package example.generic.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// List 계열의 컬렉션 프레임 워크
		// 1) 자료의 저장 순서가 있다.(인덱스를 사용 할 수 있다.)
		// 2) 중복된 자료의 저장이 가능하다.

		// => ArrayList, LinkedList
		// ArrayList : 배열기반
		// 데이터가 추가 될 때마다 배열을 새로 만들고 전에 있던 데이터를 복사
		// => LinkedList : 연결리스트 기반
		// 데이터를 추가하면 노드가 하나 늘어난다. (노드끼리 연결)

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("B");
		arrList.add("C");
		arrList.add("D");

		// List의 길이를 얻는 메소드 : size()
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		System.out.println();
		arrList.set(1, "D");
		System.out.println(arrList.get(1));

		// 삭제
		arrList.remove(1); // 인덱스를 이용한 삭제
		System.out.println(arrList);
		arrList.remove("D"); // 객체를 이용해서 삭제
		System.out.println(arrList);

		System.out.println("hello".toUpperCase());

		arrList.add("B");
		arrList.add("B");
		arrList.add("F");

		System.out.println(arrList);

	}

}
