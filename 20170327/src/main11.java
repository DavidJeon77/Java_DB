import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main11 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("ObjectData.txt");

		if (file.exists()) {
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(in);

			// �� ����ȭ : byte[] ���·� �Ǿ� �ִ� ��ü�� ������ ��ü ���·� �ٲٴ� ��
			// DeSerializable
//			Person p1 = (Person) ois.readObject();
//			Person p2 = (Person) ois.readObject();
//			Person p3 = (Person) ois.readObject();
//			
//			System.out.println(p1);
//			System.out.println(p2);
//			System.out.println(p3);
			
			Person temp = null;
			while((temp = (Person)ois.readObject()) != null){
				System.out.println(temp);
			}

			ois.close();

		} else {
			System.out.println("not exists");
		}

	}

}
