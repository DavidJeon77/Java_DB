import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main04 {

	public static void main(String[] args) throws IOException {
		File file = new File("BufferedTest1.txt");
		
		if(file.exists()){
			// 1) 주 스트림 객체 생성
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);
			// BufferedReader readLine() => 한 줄씩 한꺼번에 읽어온다. (개행문자를 만나기 전까지의 문자열들을 한번에 읽어온다.)
			
			String line = "";
			
			// 한 줄씩 읽어오다가 더 이상 읽을 줄이 없을 때 까지 반복
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			br.close();
		}

	}

}
