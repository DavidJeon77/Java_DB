import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class main08 {

	public static void main(String[] args) throws IOException {
		// DataInputOutputStream
		// 자바의 기본자료형의 입출력을 손쉽게 해준다.
		
		File dataFile = new File("dataFile.txt");
		if(!dataFile.exists()){
			dataFile.createNewFile();
		}
		
		FileOutputStream out = new FileOutputStream(dataFile);
		// 자바의 기본자료형을 출력하시 위해 DataOutputStream 생성
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(100);
		dos.writeLong(1000L);
		dos.writeDouble(10.123);
		dos.writeUTF("String");
		
		dos.close();
		System.out.println("Program exit");
		
		
		
		
		
	}

}
