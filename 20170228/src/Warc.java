public class Warc implements IStarcraft {

	int result1 = 0;
	int result2 = 0;
	int result3 = 0;

	// �ǹ� ����
	final static int WAR_BARRUCK = 200;
	final static int CRYPT = 250;

	// ���� ����
	final static int FOOTMAN = 70;
	final static int ORC = 80;
	final static int GHOUL = 110;

	// ���� �� �ִ� �ǹ� �� ��� �� ���
	@Override
	public void buildingCalc(int resource) {
		result1 = resource / WAR_BARRUCK;
		result2 = resource / CRYPT;
		System.out.println(resource + "���� �ڿ����δ� WAR_BARRUCK" + result1
				+ "�� �Ǵ� CRYPT " + result2 + "���� ���� �� �ִ�.");
	}

	// ���� �� �ִ� ���� �� ��� �� ���
	@Override
	public void unitCalc(int resource) {
		result1 = resource / FOOTMAN;
		result2 = resource / ORC;
		result3 = resource / GHOUL;
		System.out.println(resource + "���� �ڿ����δ� FOOTMAN " + result1
				+ "�� �Ǵ� ORC " + result2 + "���� �Ǵ� GHOUL " + result3
				+ "������ ���� �� �ִ�.");

	}

	// �ش� ������ ���� �� �ִ� �ǹ� ����
	@Override
	public void printBuildingInfo() {
		System.out.println("��ũ ������ ���� �� �ִ� �ǹ�");
		System.out.println("1] WAR_BARRUCK ���� : " + WAR_BARRUCK + "��");
		System.out.println("2] CRYPT ���� : " + CRYPT + "��");

	}

	// �ش� ������ ���� �� �ִ� ���� ����
	@Override
	public void printUnitInfo() {
		System.out.println("��ũ ������ ������ �� �ִ� ����");
		System.out.println("1] FOOTMAN ���� : " + FOOTMAN + "��");
		System.out.println("2] ORC ���� : " + ORC + "��");
		System.out.println("3] GHOUL ���� : " + GHOUL + "��");

	}

}