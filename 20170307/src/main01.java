public class main01 {

	public static void main(String[] args) {

		// ������
		// ���� ������ - ���� �ϳ��ۿ� ���� ����.
		// ���� ���� ���� - ������ ������ ��(�����ݷ� - ;)�� ������ ���� ���� �Ǵ� ����
		// ���� ���� ���� - ������ ������ ���� ���� �Ǵ� ����

		int num1 = 10;
		int num2 = 20;

		System.out.println((++num1) + (++num2)); // 11 + 21 = 32

		System.out.println((num1--) + (++num2)); // 11 + 22 = 33

		num1 = 5;
		num2 = 2;

		// ������ ����

		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

		System.out.println((double) num1 / num2);
		System.out.println(num1 / (double) num2);

		// ���迬����

		System.out.println(num1 > num2);// num1�� num2���� ũ��.
		System.out.println(num1 >= num2);// num1�� num2���� ũ�ų� ����.

		System.out.println(num1 < num2);// num1�� num2���� �۴�.
		System.out.println(num1 <= num2);// num1�� num2���� �۰ų� ����.

		// �������

		System.out.println(num1 == num2);// num1�� num2�� ����.
		System.out.println(num1 != num2);// num1�� num2�� ���� �ʴ�.
		System.out.println(num1 != 5);//

		// ��������
		// && (AND)
		// || (OR)

		System.out.println(num1 == 5 && num2 == 2);
		System.out.println(num1 == 5 || num2 == 2);

		// ���׿�����(���� ������)
		// BOOLEAN ? ����1 : ����2
		// BOOLEAN�� ���̸� ����1 ���� ����
		// BOOLEAN�� �����̸� ����2 ���� ����

		// ������ ���� �� �� ����� Ȯ�� �� �� ����Ѵ�.
		String result = num1 > 5 ? "AAA" : "BBB";
		System.out.println(result);

		// num1�� 0�� 10���̿� �ִ� ���̶�� "DDD" �ƴϸ� "EEE" ���
		// 0 < num1 < 10
		result = num1 > 0 && num1 < 10 ? "DDD" : "EEE";
		System.out.println(result);

		num2 = 10;

		num2 += 10;
		System.out.println(num2);
		num2 -= 10;
		System.out.println(num2);

		num2 *= 5;
		System.out.println(num2);
		num2 /= 5;
		System.out.println(num2);
		num2 %= 5;
		System.out.println(num2);

	}
}
