/*
 * ��Ű���� �ٸ� ��쿡�� 
 * ����ϰ��� �ϴ� Ŭ������ ��Ű���� �ٸ� ��쿡�� 
 * import�� �̿��Ͽ� Ŭ������ ��� ���� �ϰ� �ؾ� �Ѵ�.
 */

import example_class.Person;

public class main01 {

	public static void main(String[] args) {

		int a = 10;
		// new Ű���带 �̿��ؼ� Ŭ������ ��ü�� �����.
		// ��ü�� ���� ���� heap �޸𸮿� ��ü�� ���� �޸� ������ �Ҵ� �ǰ�
		// �޸� �ּҰ��� �߻� ��Ų��.

		Person p1 = new Person();
		System.out.println(p1);

//		p1.age = 15;
//		p1.name = "ASDF";
//		p1.job = "job";
		
		p1.printPersonInfo();// person Class�� printPersonInfo() �޼ҵ� ȣ��
		p1.changePersonAge(20);// person Class�� changePersonAge(int) �޼ҵ� ȣ��
		String p1Name = p1.getPersonName();
		String p1Job = p1.changeJob("new job");
		
		
		
		
		
		

	}
}
