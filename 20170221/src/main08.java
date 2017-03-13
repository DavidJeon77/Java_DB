
public class main08 {

	public static void main(String[] args) {
		// 클래스를 이용한 객체 만들기
		// 객체를 만들 때는 new 키워드를 활용한다.
		Person p1 = new Person();
		
		// 객체 안에 있는 메소드 사용하기
		
		// 객체명.메소드이름(매개변수)
		// 객체명.변수이름
		
		p1.age =10;
		p1.name = "AA";
		p1.job = "student";
		
		p1.printPersonInfo();
		
		// changeJob 메소드는 String 형태의 매개변수를 요구
		p1.changeJob("middle school student"); // String 형태만 받을수 있다.
		
		//함수호출의 결과물인 리턴값을 받아서 변수에 저장 할 수 있다.
		int pAge = p1.getAge();
		System.out.println("p1의 나이 : "+pAge);
		
		
		String pName = p1.changeName("BBB");
		System.out.println(pName);
		
		
		
	}

}
