import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class main10 {

	public static void main(String[] args) throws IOException {
		// ��ü ��ü�� ����� �ϴ� ObjectInput / OutputStream
		// ����� ��� ��ü�� ����ȭ�� �ʿ��ϴ�. (Serializable �������̽� implements)

		File file = new File("ObjectData.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(out);

		// writeObject �޼ҵ带 Ȱ���Ͽ� ����ȭ ����� �� ��ü�� ����Ѵ�.
		// * ����ȭ : �������, �޼ҵ� �� ����ȭ�� ��ü�� byte[] ���·� �ٲٴ� ��
		// �ݵ�� Serializable �������̽��� �����ؾ�(implements) ����ȭ�� ����� �ȴ�.

		oos.writeObject(new Person("AAA", 10));
		oos.writeObject(new Person("BBB", 20));
		oos.writeObject(new Person("CCC", 30));

		// ��ü�� ����� ������ �� �������� null�� �־�����.

		oos.writeObject(null);

		oos.close();
		System.out.println("exit");

	}

}

// ����ȭ �������̽� ����
// ���� �����ؾ� ��(�������̵� ��) �޼ҵ�� ������ ObjectInput/OutputStream����
// Serializable �������̽��� ���� �ߴ��� ���θ� �Ǵ��Ѵ�.
// ObjectInput/OutputStream�� Ȱ���ϱ� ���ؼ��� ��ü�� �Է��ϴ���, ��� �ϴ��� ��� �Ȱ��� Ŭ������
// ��� �ؾ� �Ѵ�.
// ���� �� ��ſ����� ��� ���� �ʴ´�.(���� ���Ͽ� ��ü�� ������ ���� �ٽ� �ҷ����� ���·� ���� ���)

class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name=" + name + ", age=" + age + "]";
	}

}