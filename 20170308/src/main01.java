/*
 * 패키지가 다를 경우에는 
 * 사용하고자 하는 클래스의 패키지가 다를 경우에는 
 * import를 이용하여 클래스를 사용 가능 하게 해야 한다.
 */

import example_class.Person;

public class main01 {

	public static void main(String[] args) {

		int a = 10;
		// new 키워드를 이용해서 클래스를 객체로 만든다.
		// 객체를 만든 순간 heap 메모리에 객체를 위한 메모리 공간이 할당 되고
		// 메모리 주소값을 발생 시킨다.

		Person p1 = new Person();
		System.out.println(p1);

//		p1.age = 15;
//		p1.name = "ASDF";
//		p1.job = "job";
		
		p1.printPersonInfo();// person Class의 printPersonInfo() 메소드 호출
		p1.changePersonAge(20);// person Class의 changePersonAge(int) 메소드 호출
		String p1Name = p1.getPersonName();
		String p1Job = p1.changeJob("new job");
		
		
		
		
		
		

	}
}
