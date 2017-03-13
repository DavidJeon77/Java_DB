//class 클래스명
// 클래스명의 앞글자는 항상 대문자로 만든다.
public class Person {
	// 1) Person에서 사용할 데이터를 정의
	int age; // 이름
	String name; // 나이
	String job; // 직업

	// 2) Person에서 사용할 기능 정의

	// 리턴 형태 메소드이름 ( 매개변수 ){
	// 호출 시 수행할 기능
	// ...
	// }
	void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
		System.out.println();
	}

	// changeJob 메소드를 호출하기 위해서는 매개변수를 String 형태로 넣어 주어야 한다.
	void changeJob(String changeJob) {
		System.out.println("직업 바꾸기");
		job = changeJob;
		System.out.println();
	}

	// getAge()를 호출 하게 되면 int형 값이 나온다.
	int getAge() {
		return age;
	}
	

	// changeName 메소드를 호출 할 때
	// String 형태의 매개변수를 넣어야 하고
	// 호출 시에 String 형태로 값을 받아 낼 수가 있다.
	String changeName(String changeName) {
		name = changeName;
		return name;
	}

}
