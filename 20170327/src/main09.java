import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class main09 {

	public static void main(String[] args) throws IOException {
		
		File datafile = new File("dataFile.txt");
		
		if(datafile.exists()){
			FileInputStream in = new FileInputStream(datafile);
			// �⺻ �ڷ��� ������ �����͸� �о���� ���� DataInputStream �ʿ�
			DataInputStream dis = new DataInputStream(in);
			
			//DataInputStream�� �̿��Ͽ� �����͸� �о� �� ���� write�� ���� �״�� �о� �;� �Ѵ�.
			int int_data = dis.readInt();
			long long_data = dis.readLong();
			double double_data = dis.readDouble();
			String string_data = dis.readUTF();
			
			System.out.println(int_data);
			System.out.println(long_data);
			System.out.println(double_data);
			System.out.println(string_data);
			
			
			dis.close();
			
		}else{
			System.out.println("not exists");
		}
		


		

	}

}
