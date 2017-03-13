package example_class3;

public abstract class AA {

	int n;

	// 일반저긴 상속과 같이 자식 클래스에서 생성에 대한 책임을 져야 한다.
	public AA(int n) {
		this.n = n;
	}

	// 자식 클래스에서 반드시 오버라이딩 해야한다.
	protected abstract void foo();

	// 자식 클래스에서 필요시(선택적으로) 오버라이딩을 할 수 있다.
	protected void goo() {
		System.out.println("A_GOO()");
	}

}
