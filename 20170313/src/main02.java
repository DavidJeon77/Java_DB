import example_class.*;

public class main02 {
	public static void main(String[] args) {
		// 1) toString

		A a1 = new A(10);
		A a2 = new A(10);

		String str = a1.toString();
		System.out.println(a1);
		System.out.println(str);
		// example_class.A@7852e922
		// example_class.A@7852e922
		// ��Ű���̸�.Ŭ�����̸�@�޸��ּҰ�

		// 2) equals
		// �������( == )�� ����

		if (a1 == a2) {
			System.out.println("a1=a2");
		} else {
			System.out.println("a1!=a2");
		}

		Person p1 = new Person("A", 25, "0313");
		Person p2 = new Person("A", 25, "0313");

		if (p1 == p2) {
			System.out.println("p1 = p2");

		} else {
			System.out.println("p1 != p2");
		}

		// Object Ŭ������ equals ���
		if (p1.equals(p2)) {
			// p1�� �������� p2�� ���Ѵ�. �޼ҵ带 ȣ�������� ���ذ��̴�.

			// ObjectŬ���������� �⺻������ equals �޼ҵ带 ���� �����ڿ� ���� �ϰ� ����Ѵ�
			// -> �޸� �ּҰ� ��

			System.out.println(" = ");
		} else {
			System.out.println(" != ");
		}

	}
}
