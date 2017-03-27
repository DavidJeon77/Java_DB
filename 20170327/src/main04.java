import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main04 {

	public static void main(String[] args) throws IOException {
		File file = new File("BufferedTest1.txt");
		
		if(file.exists()){
			// 1) �� ��Ʈ�� ��ü ����
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);
			// BufferedReader readLine() => �� �پ� �Ѳ����� �о�´�. (���๮�ڸ� ������ �������� ���ڿ����� �ѹ��� �о�´�.)
			
			String line = "";
			
			// �� �پ� �о���ٰ� �� �̻� ���� ���� ���� �� ���� �ݺ�
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			br.close();
		}

	}

}
