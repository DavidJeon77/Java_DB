import example_class.B;

public class main01 {

	public static void main(String[] args) {

		B b1 = new B(12, 12);
		String str = b1.toString(); // B ���� toString()�� ������ �Ǿ� ���� �ʱ� ������
									// �ٷ� ���Ǻθ��� AŬ������ toString()�� ȣ���Ѵ�.
									// ���� A���� toString()�� ������ ���� ������
									// Object�� toString()�� ȣ�� �Ѵ�.
		System.out.println(str);
		System.out.println(b1);

	}
}
