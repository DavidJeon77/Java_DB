package example.generic.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// HashMap -> 웹, 빅데이터, 안드로이드 등 모든곳에서 제일 많이 사용함.
		// 컨텐츠 용도가 아닌, 실제 데이터를 전송 또는 수신 할 때 많이 사용된다. (JSON, BSON)
		// key - Value 방식

		// 저장시에는 : 키-값 쌍으로 저장
		// 참조시 : 키만 집어 넣어서 값을 참조한다.

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");

		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

		// key 는 set 방식으로 저장
		// Value는 ArrayList방식으로 저장

		hashMap.put("ID", "What");
		id = hashMap.get("ID");

		System.out.println(id);

		hashMap.put("PW", "WHAT");
		pw = hashMap.get("PW");

		System.out.println(pw);

	}

}
