package example_class3;

public abstract class AA {

	int n;

	// �Ϲ����� ��Ӱ� ���� �ڽ� Ŭ�������� ������ ���� å���� ���� �Ѵ�.
	public AA(int n) {
		this.n = n;
	}

	// �ڽ� Ŭ�������� �ݵ�� �������̵� �ؾ��Ѵ�.
	protected abstract void foo();

	// �ڽ� Ŭ�������� �ʿ��(����������) �������̵��� �� �� �ִ�.
	protected void goo() {
		System.out.println("A_GOO()");
	}

}
