
public class main01 {

	public static void main(String[] args) {
		// main������ AAA Ŭ������ ��ü�� ����� ����ϴ� AAAŬ���� ���忡���� '�ܺ�' �̴�.
		
		// �ܺο��� AAAŬ������ ������� �� ��ü�� ����� ���
		// new Ű���带 Ȱ���Ͽ� AAAŬ������ ��ü (�ν��Ͻ�)�� �����.
		
		// new Ű���带 Ȱ���Ͽ� ��ü�� �����ϸ� Heap�޸� ������ AAAŬ������ ��ü�� �Ҵ�ǰ�,
		// �޸� �ּҰ��� �߻� ��Ų��.
		// �̶� �߻��� �޸� �ּҰ��� �������� (aaa)�� ���Եȴ�.
		// * �Ҵ� : ���� �������� �޸� ������ ����
		
		AAA aaa =new AAA();
		System.out.println(aaa);
		
		// ���ٿ����� (.) -> �������� aaa�� ������ �ִ� �޸��ּҿ� 
		// �����Ǵ� �ν��Ͻ��� ���� ������ (�������, �޼ҵ�) �� ��� �� �� �ְ� ���ִ� ������
		aaa.str1 = "������";
		aaa.showInfo();
		aaa.getNum1();
		
		
		
		
		
		
		
		
	}

}