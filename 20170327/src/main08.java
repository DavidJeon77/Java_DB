import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class main08 {

	public static void main(String[] args) throws IOException {
		// DataInputOutputStream
		// �ڹ��� �⺻�ڷ����� ������� �ս��� ���ش�.
		
		File dataFile = new File("dataFile.txt");
		if(!dataFile.exists()){
			dataFile.createNewFile();
		}
		
		FileOutputStream out = new FileOutputStream(dataFile);
		// �ڹ��� �⺻�ڷ����� ����Ͻ� ���� DataOutputStream ����
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(100);
		dos.writeLong(1000L);
		dos.writeDouble(10.123);
		dos.writeUTF("String");
		
		dos.close();
		System.out.println("Program exit");
		
		
		
		
		
	}

}
