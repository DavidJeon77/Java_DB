
public class B {
	
	public static int s_num = 0;		// static ���� (��������) => ���α׷��� ���� �� �� �� �ѹ��� ����� �� 
	
	public int m_num = 0;			// �ν��Ͻ� ���� (�������) => ��ü�� ����� �� �� ���� ����� ����.
	
	public B(){
		s_num++;
		this.m_num++;
		
		System.out.println("s_num : "+s_num);
		System.out.println("m_num : "+m_num);
		System.out.println();
	}
	
	// static �޼ҵ�� ���α׷� ���� �Ҷ� �̹� ��� ������ �����̴�.
	// static �޼ҵ忡���� �Ϲ� ��������� ��� �� �� ����.
	public static void s_showInfo() {
		System.out.println("s_num : "+s_num);
		//System.out.println("m_num : "+m_num);
	}
	// �Ϲ� ��� �޼ҵ�� ��ü�� ����� ������ ��� �� �� �ִ�.
	
	public void m_showInfo() {
		System.out.println("s_num : "+s_num);
		System.out.println("m_num : "+m_num);
	}

}
