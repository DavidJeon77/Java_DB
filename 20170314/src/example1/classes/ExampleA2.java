package example1.classes;

import example1.interfaces.IExampleA3;

// IExampleA3가 IExampleA1, IExampleA2가 확장된것이다
public class ExampleA2 implements IExampleA3 {

	@Override
	public void foo() {
		System.out.println("IExampleA2.foo()");
	}

	@Override
	public void koo() {
		System.out.println("IExampleA2.koo()");
	}

	@Override
	public void moo() {
		System.out.println("IExampleA2.moo()");
	}

}
