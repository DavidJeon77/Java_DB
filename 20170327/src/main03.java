import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main03 {

	public static void main(String[] args) throws IOException {

		// ���� ��Ʈ��
		// => �� ��Ʈ���� �������ִ� ��Ʈ��
		// �� ��Ʈ������ ���� �������� ��ɵ��� �����Ѵ�.
		// BufferedReader/InputStream
		// BufferedWriter/OutputStream

		File file = new File("BufferedTest1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		// 1) �� ��Ʈ���� �����Ѵ�.
		FileWriter out = new FileWriter(file);
		// 2) ������Ʈ���� �����. �Ű������� �� ��Ʈ�� ��ü�� ��� ����.
		BufferedWriter bw = new BufferedWriter(out);

		// 5�� ¥�� �迭
		bw.write("Hello");	// char() ���۸� �����.�ش� ���ڿ��� ������ŭ�� char �� �迭�� �����
							// �ش� �����͸� ���� �� �Ŀ� ���Ͽ� �����Ѵ�. \n�Ǵ� ���ڿ��� ���� ���� ��������
							// BufferedWriter���� �ڵ����� �迭�� ����� ����.
		
		bw.write(" World!!!");	// 8�� ¥�� �迭

		// ���� ��Ʈ���� ������ �� ��Ʈ���� �ڵ����� ������.
		bw.close();

	}

}
