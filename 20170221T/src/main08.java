public class main08 {

	public static void main(String[] args) {
		// 클래스를 이용한 객체 만들기
		// 객체를 만들 때는 new 키워드를 활용한다.
		Person p1 = new Person();

		// 객체 안에 있는 메소드 사용하기

		// 객체명.메소드이름(매개변수)
		// 객체명.변수이름

		p1.age = 10;
		p1.name = "AA";
		p1.job = "초등학생";

		p1.printPersonInfo();

		// changeJob 메소드는 String 형태의 매개변수를 요구
		p1.changeJob("중학생");
		// p1.changeJob(); //매개변수가 없기 때문에 에러 발생
		// p1.changeJob(10); //String 매개변수를 넣어야 하는데 정수형 매개변수를 넣고 있기 때문에 에러

		// 함수 호출의 결과물인 리턴값을 받아서 변수에 저장 할 수 있다.
		int pAge = p1.getAge();

		System.out.println("p1의 나이 : " + pAge);

		// changeName 호출시에 String 형태의 매개변수를 전달
		// 호출이 완료 되면 String 형태의 리턴값으로 받아 낼 수 있다.
		String pName = p1.changeName("BBB");
		System.out.println(pName);

	}

}
