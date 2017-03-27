import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main07 {

	public static void main(String[] args) throws IOException {

		// 읽어올 파일 (원본 파일) 준비

		File OriginFile = new File("EH.jpg");

		if (OriginFile.exists()) {
			// 1)
			FileInputStream in = new FileInputStream(OriginFile);
			// 2)
			BufferedInputStream bis = new BufferedInputStream(in);
			// 3)
			byte[] buffer = new byte[1024];

			// 4) 복사 파일 준비
			File copyfile = new File("copy_EH.jpg");

			// BufferedOutputStream 으로 입력 받은 버퍼에 들어 있는 데이터를 copyFile에 출력
			// 출력을 위한 OutputStream이 필요하다.
			FileOutputStream out = new FileOutputStream(copyfile);
			BufferedOutputStream bos = new BufferedOutputStream(out);

			int readCount = -1;
			int total_readCount = 0;

			while ((readCount = bis.read(buffer)) != -1) {
				total_readCount += readCount;

				// BufferedInputStream을 이용하여 읽어들인 버퍼를
				// 그대로 BufferedOutputStream을 이용하여 출력한다.
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
