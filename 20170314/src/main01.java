import example1.classes.ExampleA;
import example1.classes.ExampleA2;
import example1.interfaces.IExampleA;

public class main01 {
	public static void main(String[] args) {

		ExampleA exampleA = new ExampleA();

		exampleA.foo();
		exampleA.koo();

		ExampleA2 exampleA2 = new ExampleA2();

		exampleA2.foo();
		exampleA2.koo();
		exampleA2.moo();

		IExampleA.goo();

	}
}
