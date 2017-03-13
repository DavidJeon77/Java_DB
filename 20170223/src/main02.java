
public class main02 {

	public static void main(String[] args) {
		B.s_num++;
		System.out.println(B.s_num);
		
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();
		
		// 외부에서 static 변수 활용하기
		// 단, static 변수가 public으로 되어 있어야 함.
		// static 변수도 접근지시제어자의 영향을 받는다.
		
		// 클래스명.static 변수명
		
		System.out.println("B.s_num : "+B.s_num);
		System.out.println("b1.s_num : "+b1.s_num);	// 사용하지 말것
													// 
		
		
		// 결과물?
		
		
		
	}

}
