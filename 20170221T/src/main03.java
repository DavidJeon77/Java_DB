public class main03 {

	public static void main(String[] args) {

		// 1) ������ ����
		int score = -50;
		char grade;
		// ����ڰ� ������ �߸� �Է� ���� ���.
		// ���� ��ȿ���� �ʾ��� ���� ó���� ���� �� �ش�.
		if (score < 0 || score > 100) {
			System.out.println("�߸��� ���� �Դϴ�.");
		} else {
			if (score >= 90 && score <= 100) {
				grade = 'A';
			} else if (score >= 80 && score < 90) {
				grade = 'B';
			} else if (score >= 70 && score < 80) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			System.out.println(grade);
		}

	}

}
