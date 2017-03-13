public class Terran implements IStarcraft {
	private final static int MARINE = 50;
	private final static int GHOST = 75;
	private final static int TANK = 150;

	private final static int STAR_BARRUCK = 150;
	private final static int FACTORY = 200;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� STAR_BARRUCK "
				+ (resource / STAR_BARRUCK) + "�� �Ǵ� FACTORY "
				+ (resource / FACTORY) + "�� �� ���� �� �ִ�.");

		// System.out.println(resource + "���� �ڿ����� �Ǽ��� �� �ִ� STAR_BARRUCK�� �� : " +
		// (resource / STAR_BARRUCK) + "\t ���� �ڿ� : "
		// + (resource % STAR_BARRUCK));
		// System.out.println(resource + "���� �ڿ����� �Ǽ��� �� �ִ� FACTORY�� �� : " +
		// (resource / FACTORY) + "\t\t ���� �ڿ� : "
		// + (resource % FACTORY));
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� MARINE " + (resource / MARINE)
				+ "���� �Ǵ� GHOST " + (resource / GHOST) + "���� �Ǵ� TANK "
				+ (resource / TANK) + "������ ���� �� �ִ�.");
		// System.out.println(resource + "���� �ڿ����� ������ �� �ִ� MARINE�� �� : " +
		// (resource / MARINE) + "\t\t ���� �ڿ� : "
		// + (resource % MARINE));
		// System.out.println(
		// resource + "���� �ڿ����� ������ �� �ִ� GHOST�� �� : " + (resource / GHOST) +
		// "\t\t ���� �ڿ� : " + (resource % GHOST));
		// System.out.println(
		// resource + "���� �ڿ����� ������ �� �ִ� TANK�� �� : " + (resource / TANK) + "\t ����
		// �ڿ� : " + (resource % TANK));
	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Terran ������ �Ǽ��� �� �ִ� �ǹ�");
		System.out.println("1] Star_Barruck ���� : " + STAR_BARRUCK + "��");
		System.out.println("2] FACTORY ���� : " + FACTORY + "��");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Terran ������ ������ �� �ִ� ����");
		System.out.println("1]MARINE�� ���� : " + MARINE + "��");
		System.out.println("2]GHOST�� ���� : " + GHOST + "��");
		System.out.println("3]TANK�� ���� : " + TANK + "��");

	}

}