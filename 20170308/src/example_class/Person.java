package example_class;

public class Person {

	// 1) 클래스를 만들때는 항상 데이터 부터
	// => 멤버변수 부터 만들자
	private int age = 10;
	private String name = "A";
	private String job = "B";

	// 1-2) 멤버 변수에 대한 getter / setter 정의
	// => 모든 클래스의 멤버변수는 private 형태로 정의가 되어야 하기 때문에(정보은닉)
	// 내부에서만 접근 할 수가 다.

	// 필요에 따라서 외부에서 멤버변수에 접근을 하고자 getter와 setter를 정의 한다.
	// getter : 외부에서 데이터를 가져오는 기능
	// setter : 외부에서 데이터를 입력답아 세팅하는 기능

	// getter / setter를 이용함으로써 외부에서 멤버변수에 대한 접근을 제어 할 수 있다.
	// 멤버변수의 값을 가지고 오게만 하고 싶다 => getter만 정의
	// 멤버변수의 값을 세팅만 하게 하고 싶다 => setter만 정의
	// 멤버변수의 값을 가지고 올 수도 있고,세팅도 하게 하고 싶다 => getter / setter 정의

	// 모든 getter / setter는 public으로 지정 되어 진다.

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 2) 메소드(기능) 에 대한 정의
	// 메소드 앞자리는 반드시 소문자로 시작해야 한다.

	

	// 1) 매개변수 X 리턴값 X
	public void printPersonInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(job);
	}

	// 2) 매개변수 O 리턴값 X
	public void changePersonAge(int _age) {
		age = _age;
		System.out.println("나이가 변경 되었습니다.");
	}

	// 3) 매개변수 X 리턴값 O
	public String getPersonName() {
		return name;
	}

	// 4) 매개변수 O 리턴값 O
	public String changeJob(String _job) {
		job = _job;
		System.out.println("직업이 변경 되었습니다.");
		return _job;
	}

}
