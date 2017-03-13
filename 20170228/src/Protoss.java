public class Protoss implements IStarcraft {

	final static int GATEWAY = 150;
	final static int STARGATE = 200;

	final static int ZEALOT = 100;
	final static int DRAGOON = 125;
	final static int SCOUT = 225;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� GATEWAY " + resource / GATEWAY
				+ "�� �Ǵ� STARGATE " + resource / STARGATE + "���� ���� �� �ִ�.");
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� ���� " + resource / ZEALOT
				+ "�� �Ǵ� ���" + resource / DRAGOON + "�� �Ǵ� ��ī�� " + resource
				/ SCOUT + "�� ���� �� �ִ�.");
	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Protoss ������ �Ǽ��� �� �ִ� �ǹ�");
		System.out.println("1] GATEWAY ���� : " + GATEWAY + "��");
		System.out.println("2] STARGATE ���� : " + STARGATE + "��");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Protoss ������ ������ �� �ִ� ����");
		System.out.println("1] ZEALOT ���� : " + ZEALOT + "��");
		System.out.println("2] DRAGOON ���� : " + DRAGOON + "��");
		System.out.println("3] SCOUT ���� : " + SCOUT + "��");
	}

}
