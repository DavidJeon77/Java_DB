
public class main03 {

	public static void main(String[] args) {
		
		//1) �θ��� �����ں��� ȣ���Ѵ�.( �θ� ��ü�� ���� ���� ���� )
		//2) �ڽ��� �����ڸ� ȣ�� �Ѵ�. (�θ� ��ü�� ����� �� ���� �� ��ü�� �����ϴ� ���·� �ڽİ�ü�� ����� ����.)
		Child child = new Child();	//new Child() �� �߻��ϴ� �޸� �ּҰ� : Child ��ü�� �ּҰ�
		child.foo();		//�θ� ���ǵ� foo() �Լ�
		child.goo();		//�ڽĿ� ���ǵ� goo() �Լ�
		
		
		Parent parent = new Parent();	//�θ��� �����ڸ� ȣ��.. �ڽ� �����ڴ� ȣ�� X
		parent.foo();		//�θ� ������ �ִ� foo() ȣ�� ����
		//parent.goo();		//error! �ڽ��� ������ �ִ� goo() ȣ�� �Ұ���
		
		
	}
	
}
