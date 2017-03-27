import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main07 {

	public static void main(String[] args) throws IOException {

		// �о�� ���� (���� ����) �غ�

		File OriginFile = new File("EH.jpg");

		if (OriginFile.exists()) {
			// 1)
			FileInputStream in = new FileInputStream(OriginFile);
			// 2)
			BufferedInputStream bis = new BufferedInputStream(in);
			// 3)
			byte[] buffer = new byte[1024];

			// 4) ���� ���� �غ�
			File copyfile = new File("copy_EH.jpg");

			// BufferedOutputStream ���� �Է� ���� ���ۿ� ��� �ִ� �����͸� copyFile�� ���
			// ����� ���� OutputStream�� �ʿ��ϴ�.
			FileOutputStream out = new FileOutputStream(copyfile);
			BufferedOutputStream bos = new BufferedOutputStream(out);

			int readCount = -1;
			int total_readCount = 0;

			while ((readCount = bis.read(buffer)) != -1) {
				total_readCount += readCount;

				// BufferedInputStream�� �̿��Ͽ� �о���� ���۸�
				// �״�� BufferedOutputStream�� �̿��Ͽ� ����Ѵ�.
				bos.write(buffer);

				System.out.println("copying File >> " + total_readCount + " / " + OriginFile.length());

			}

			bos.close();
			bis.close();

		} else {
			System.out.println("not exists File ");
		}
		System.out.println("Program exit");

	}

}
