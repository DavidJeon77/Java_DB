public class main02 {

	public static void main(String[] args) {

		// ���ǹ�

		/*
		 * if (����) { // if�� ���� �� ������ ���� } else if (����) { // if�� �����϶� // else if
		 * ������ ���϶� ������ ���� // else if ���� �������� �ü� �ִ�. } else { // if�� else if�� ������
		 * ��� ������ �� ���� �� ���� }
		 */

		int num1 = 10;
		int num2 = 30;

		if (num1 == num2) {
			System.out.println("num1 = num2");
		} else {
			System.out.println("num1 != num2");
		}

		if (num1 == num2) {
			System.out.println("num1 = num2");
		} else if (num1 > num2) {
			System.out.println("num1 > num2");
		} else if (num1 < num2) {
			System.out.println("num1 < num2");
		} else {
			System.out.println("?????");
		}

		// ���ǹ��� �� �� ����� ���
		if (num1 == num2) {
			System.out.println("num1 = num2");
		}
		if (num1 > num2) {
			System.out.println("num1 > num2");
		}
		if (num1 < num2) {
			System.out.println("num1 < num2");
		}

		// ��ø�� ���ǹ�
		if (num1 >= num2) {
			System.out.println("num1 >= num2");
			if (num1 > num2) {
				System.out.println("num1 > num2");
			} else {
				System.out.println("num1 = num2");
			}
		}else{
			System.out.println("num1 < num2");
		}
		
		
		
		
		

	}

}
