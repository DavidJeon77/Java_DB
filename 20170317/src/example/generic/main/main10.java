package example.generic.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// HashMap -> ��, ������, �ȵ���̵� �� �������� ���� ���� �����.
		// ������ �뵵�� �ƴ�, ���� �����͸� ���� �Ǵ� ���� �� �� ���� ���ȴ�. (JSON, BSON)
		// key - Value ���

		// ����ÿ��� : Ű-�� ������ ����
		// ������ : Ű�� ���� �־ ���� �����Ѵ�.

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");

		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

		// key �� set ������� ����
		// Value�� ArrayList������� ����

		hashMap.put("ID", "What");
		id = hashMap.get("ID");

		System.out.println(id);

		hashMap.put("PW", "WHAT");
		pw = hashMap.get("PW");

		System.out.println(pw);

	}

}
