import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class main01 {
	public static void main(String[] args) throws IOException {
		
		// 1) ���� Ŭ����
		// => ��ũ�� �����ϴ� ������ �ٷ�� ���� Ŭ����
		//					������ ���
		File file = new File("test1.txt");
		
		// ���࿡ ������ �������� ������
		// file.exists() => ������ �����ϸ� true, �������� ������ false
		if(!file.exists()){
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
			file.createNewFile();	// ������ ���� �����.
		}
		
		// 1) ������ : file - test1.txt���ٰ�
		// 2) �����͸� ��� �ҰŴ�(write)
		
		// ���Ͽ� �ؽ�Ʈ ������ �����͸� ��� �ϱ� ���ؼ�
		// Writer ��ü�� �����.	1,2���� ���ÿ� ����
		// �� �Ѱ���?					������, �̾� ������ ����(isAppend) default : false
		Writer out = new FileWriter(file, true);
		
		out.write("ABCDE\n");
		out.write("Hello byebye");
		out.write("Hello byebe");
		out.write("Hello bybye");
		
		// �������� ������ �Ѱ��� ������ �Ϸ�Ǹ� �ٷ� �ݾ� �ش�.
		out.close();
		
		System.out.println("���α׷� ����");
		
	}

}
