// class 클래스명
// 클래스명의 앞글자는 항상 대문자로 만든다.

public class Person {
	// 1) Person class에서 사용할 데이터 정의
	int age;
	String name;
	String job;

	// 2) Person class에서 사용할 기능 정의
	// 리턴형태 메소드이름 (매개변수){
	// 호출시 수행할 일들
	// ...
	// }
	void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
	}

	// changeJob 메소드를 호출하기 위해서는 매개변수를 String 형태로 넣어주어야 한다.
	void changeJob(String changeJob) {
		System.out.println("직업 바꾸기");
		job = changeJob;
	}

	// getAge()를 호출하면 int형 값이 나온다.
	int getAge() {
		return age;
	}
	
	/*
	 * changeName 메소드를 호출할때
	 * 
	 */
	
	String changeName(String changeName){
		name = changeName;
		return name;
	}
	
	
	

}
