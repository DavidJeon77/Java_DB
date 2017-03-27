import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) throws IOException {

		File file = new File("log.txt");
		Scanner scanner = new Scanner(System.in);

		if (!file.exists()) {
			file.createNewFile();

		} else {
			// 파일 리드
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);

			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("-------------이전 파일 내용-------------");

			br.close();

		}
		// 파일 라이트
		FileWriter out = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(out);

		boolean condi = true;

		while (condi) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			if (text.toLowerCase().equals("exit")) {
				condi = false;
			} else {
				bw.write(text + "\n");
			}
		}
		bw.close();
	}
}
