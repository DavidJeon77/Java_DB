
public class main02 {

	public static void main(String[] args) {
		B.s_num++;
		System.out.println(B.s_num);
		
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();
		
		// �ܺο��� static ���� Ȱ���ϱ�
		// ��, static ������ public���� �Ǿ� �־�� ��.
		// static ������ ���������������� ������ �޴´�.
		
		// Ŭ������.static ������
		
		System.out.println("B.s_num : "+B.s_num);
		System.out.println("b1.s_num : "+b1.s_num);	// ������� ����
													// 
		
		
		// �����?
		
		
		
	}

}
