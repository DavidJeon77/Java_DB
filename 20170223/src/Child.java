// �ڽ� Ŭ���� 
// ��� Ű���� : extends
// Ȯ���̶�� �ǹ̸� ������ �ְ�, ����� ����(�ߺ��� ��ɵ��� ��� �����ش�.) ��� ���ٴ�
// ���� Ŭ������ ������� �� Ȯ�� Ŭ������ ����� ��� ���� �ؾ� �Ѵ�.
// ���� Child Ŭ������ Parent Ŭ������ Ȯ����� ���� Ŭ������ ��� ���� �ϴ� ���� ����.

public class Child extends Parent{
	
	public Child(){
		System.out.println("Child() ������ ȣ��");
	}
	
	public void goo(){
		foo();
		System.out.println("Child.goo()");
	}
}
