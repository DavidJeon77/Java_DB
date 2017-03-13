// 부모 클래스
public class Parent {
	
	public Parent(){
		System.out.println("Parent() 생성자 호출");
	}
	
	public void foo(){
		// goo();		사용 못함
		System.out.println("Parent.foo()");
	}

}
