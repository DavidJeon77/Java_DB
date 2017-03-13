package pkg_animal;

public class Lion extends carnivore {

	// 오버라이딩
	// 부모의 메소드 이름을 똑같이 작성한다.
	// 리턴형, 메소드명, 매개변수가 완벽히 똑같아야 한다.

	// 부모가 물려주고 있는 eat() 메소드를 그대로 사용 하지 않고
	// 사자가 고기를 먹는다는 형태로 다시 정의 했다.

	// 부모의 메소드를 손쉽게 오버라이딩 하는 방법
	// 마우스 오른쪽 -> source -> Override/implement Methods... -> 오버라이드할 메소드 선택

	// @Override : 어노테이션
	// 컴파일러에게 오버라이드 된 메소드다 라는 것을 알려준다.
	// 오버라이드가 안된 메소드인데 @Override 가 붙으면 에러 발생

	@Override
	public void eating() {
		System.out.println("사자가 고기를 뜯어먹는다.");
		super.eating();
	}

}
