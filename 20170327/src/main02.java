import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class main02 {
	public static void main(String[] args) throws IOException {
		File file = new File("test1.txt");
		// ������ ���� �Ѵ�
		if(file.exists()){
			// �� �Ѱ���?				   ������ => ���������� �о� ���ڴ�.(Input - Reader)
			Reader in = new FileReader(file);
			// 1) reader������ �ѱ��� �ѱ��ھ� �о�´�.
			
			int readData = 0;
										 //EOF : -1 -> End Of File
			while ((readData = in.read()) !=-1) {
				System.out.println((char)readData);
			}
			System.out.println();
			
			// ��Ʈ�� ������ �ݵ�� �ݰ� �߰��� �ڵ��� ����
			in.close();
		}else{
			System.out.println("not exists");
		}
		System.out.println("Program Exit !!");
		
		
	}

}
