package example.generic.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// List �迭�� �÷��� ������ ��ũ
		// 1) �ڷ��� ���� ������ �ִ�.(�ε����� ��� �� �� �ִ�.)
		// 2) �ߺ��� �ڷ��� ������ �����ϴ�.

		// => ArrayList, LinkedList
		// ArrayList : �迭���
		// �����Ͱ� �߰� �� ������ �迭�� ���� ����� ���� �ִ� �����͸� ����
		// => LinkedList : ���Ḯ��Ʈ ���
		// �����͸� �߰��ϸ� ��尡 �ϳ� �þ��. (��峢�� ����)

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("B");
		arrList.add("C");
		arrList.add("D");

		// List�� ���̸� ��� �޼ҵ� : size()
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		System.out.println();
		arrList.set(1, "D");
		System.out.println(arrList.get(1));

		// ����
		arrList.remove(1); // �ε����� �̿��� ����
		System.out.println(arrList);
		arrList.remove("D"); // ��ü�� �̿��ؼ� ����
		System.out.println(arrList);

		System.out.println("hello".toUpperCase());

		arrList.add("B");
		arrList.add("B");
		arrList.add("F");

		System.out.println(arrList);

	}

}
