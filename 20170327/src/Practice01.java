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

		
		if (file.exists()) {
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);

			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			FileWriter out = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(out);

			String text = scanner.nextLine();

			if (text.equals("exit")) {
				return;
			} else {
				bw.write(text + "\n");
			}
			br.close();
			bw.close();

		} else {
			FileWriter out = new FileWriter(file, true);

			BufferedWriter bw = new BufferedWriter(out);

			String text = scanner.nextLine();

			if (text.equals("exit")) {
				return;
			} else {
				bw.write(text + "\n");
			}
			bw.close();

		}

	}

}
