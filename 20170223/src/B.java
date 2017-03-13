
public class B {
	
	public static int s_num = 0;		// static 변수 (정적변수) => 프로그램이 시작 될 때 딱 한번만 만들어 짐 
	
	public int m_num = 0;			// 인스턴스 변수 (멤버변수) => 객체가 만들어 질 때 마다 만들어 진다.
	
	public B(){
		s_num++;
		this.m_num++;
		
		System.out.println("s_num : "+s_num);
		System.out.println("m_num : "+m_num);
		System.out.println();
	}
	
	// static 메소드는 프로그램 시작 할때 이미 사용 가능한 상태이다.
	// static 메소드에서는 일반 멤버변수를 사용 할 수 없다.
	public static void s_showInfo() {
		System.out.println("s_num : "+s_num);
		//System.out.println("m_num : "+m_num);
	}
	// 일반 멤버 메소드는 객체가 만들어 져야한 사용 할 수 있다.
	
	public void m_showInfo() {
		System.out.println("s_num : "+s_num);
		System.out.println("m_num : "+m_num);
	}

}
