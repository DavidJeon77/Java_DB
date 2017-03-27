import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class main09 {

	public static void main(String[] args) throws IOException {
		
		File datafile = new File("dataFile.txt");
		
		if(datafile.exists()){
			FileInputStream in = new FileInputStream(datafile);
			// 기본 자료형 형태의 데이터를 읽어오기 위해 DataInputStream 필요
			DataInputStream dis = new DataInputStream(in);
			
			//DataInputStream을 이용하여 데이터를 읽어 올 때는 write한 순서 그대로 읽어 와야 한다.
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
