import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class main02 {
	public static void main(String[] args) throws IOException {
		File file = new File("test1.txt");
		// 파일이 존재 한다
		if(file.exists()){
			// 뭘 한건지?				   목적지 => 목적지에서 읽어 오겠다.(Input - Reader)
			Reader in = new FileReader(file);
			// 1) reader에서는 한글자 한글자씩 읽어온다.
			
			int readData = 0;
										 //EOF : -1 -> End Of File
			while ((readData = in.read()) !=-1) {
				System.out.println((char)readData);
			}
			System.out.println();
			
			// 스트림 개방후 반드시 닫고 중간에 코딩을 진행
			in.close();
		}else{
			System.out.println("not exists");
		}
		System.out.println("Program Exit !!");
		
		
	}

}
