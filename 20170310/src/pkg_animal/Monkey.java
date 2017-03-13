package pkg_animal;

public class Monkey extends omnivore {

	@Override
	public void eating() {
		System.out.println("¿ø¼şÀÌ°¡ ¹äÀ» ¸Ô´Â´Ù.");
		super.eating();
	}

	@Override
	public void running() {
		System.out.println("¶Ú´Ù");
		super.running();
	}
}
