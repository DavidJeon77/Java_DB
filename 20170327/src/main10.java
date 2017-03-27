import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class main10 {

	public static void main(String[] args) throws IOException {
		// 객체 자체를 입출력 하는 ObjectInput / OutputStream
		// 입출력 대상 객체에 직렬화가 필요하다. (Serializable 인터페이스 implements)

		File file = new File("ObjectData.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(out);

		// writeObject 메소드를 활용하여 직렬화 대상이 된 객체를 출력한다.
		// * 직렬화 : 멤버변수, 메소드 등 구조화된 객체를 byte[] 형태로 바꾸는 것
		// 반드시 Serializable 인터페이스를 구현해야(implements) 직렬화의 대상이 된다.

		oos.writeObject(new Person("AAA", 10));
		oos.writeObject(new Person("BBB", 20));
		oos.writeObject(new Person("CCC", 30));

		// 객체의 출력이 끝나면 맨 마지막엔 null을 넣어주자.

		oos.writeObject(null);

		oos.close();
		System.out.println("exit");

	}

}

// 직렬화 인터페이스 구현
// 실제 구현해야 할(오버라이딩 할) 메소드는 없지만 ObjectInput/OutputStream에서
// Serializable 인터페이스를 구현 했는지 여부를 판단한다.
// ObjectInput/OutputStream을 활용하기 위해서는 객체를 입력하는쪽, 출력 하는쪽 모두 똑같은 클래스를
// 사용 해야 한다.
// 보통 웹 통신에서는 사용 하지 않는다.(로컬 파일에 객체를 저장해 놓고 다시 불러오는 형태로 많이 사용)

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