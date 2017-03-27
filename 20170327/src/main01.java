import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class main01 {
	public static void main(String[] args) throws IOException {
		
		// 1) 파일 클래스
		// => 디스크상에 존재하는 파일을 다루기 위한 클래스
		//					파일의 경로
		File file = new File("test1.txt");
		
		// 만약에 파일이 존재하지 않으면
		// file.exists() => 파일이 존재하면 true, 존재하지 않으면 false
		if(!file.exists()){
			System.out.println("파일이 존재 하지 않습니다.");
			file.createNewFile();	// 파일을 새로 만든다.
		}
		
		// 1) 목적지 : file - test1.txt에다가
		// 2) 데이터를 출력 할거다(write)
		
		// 파일에 텍스트 형태의 데이터를 출력 하기 위해서
		// Writer 객체를 만든다.	1,2번을 동시에 수행
		// 뭘 한건지?					목적지, 이어 쓸건지 여부(isAppend) default : false
		Writer out = new FileWriter(file, true);
		
		out.write("ABCDE\n");
		out.write("Hello byebye");
		out.write("Hello byebe");
		out.write("Hello bybye");
		
		// 목적지와 무엇을 한건지 설정이 완료되면 바로 닫아 준다.
		out.close();
		
		System.out.println("프로그램 종료");
		
	}

}
