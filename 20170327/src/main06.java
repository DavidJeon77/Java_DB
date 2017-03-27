import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class main06 {

	public static void main(String[] args) throws IOException {

		// 1) byte [] ��Ʈ���� InputStream, OutputStream

		// 1) ����Ʈ������ ���� �ҷ�����
		// => InputStream ���

		File file = new File("EH.jpg");
		InputStream in = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(in);

		// ���� ���۸� ������ �Ѵ�.
		byte[] buffer = new byte[1024]; // 1kb ¥�� �ٰ����� ����� ��

		// BufferedInputStream�� �̿��ؼ� ���ۿ� ��� �������� ��
		// e.g) �ٰ����� ���� ��� ������?
		
		int readCount = -1;
		while ((readCount = bis.read(buffer)) != -1) {
			System.out.println("readCount" + readCount);

		}

		bis.close();

	}

}
