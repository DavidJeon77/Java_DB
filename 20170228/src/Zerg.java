public class Zerg implements IStarcraft {

	// �ǹ�
	final static int HATCHERY = 300; // 1. ��ó��
	final static int LARE = 400; // 2. ����

	// ����
	final static int ZERGLING = 50; // 1. ���۸�
	final static int HYDRA = 75; // 2. �����
	final static int MUTAL = 100; // 3. ��Ż

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� ������ " + (resource / HATCHERY)
				+ "�� ���� " + (resource / LARE) + "���� ���� �� �ִ�.");
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� ���۸� " + (resource / ZERGLING)
				+ "���� ����� " + (resource / HYDRA) + "���� ��Ż "
				+ (resource / MUTAL) + "������ ���� �� �ִ�.");

	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Zerg ������ �Ǽ��� �� �ִ� �ǹ�");
		System.out.println("1] HATCHERY ���� : " + HATCHERY + " ��");
		System.out.println("2] LARE ���� : " + LARE + " ��");

	}

	@Override
	public void printUnitInfo() {
		System.out.println("Zerg ������ ������ �� �ִ� ����");
		System.out.println("1] ZERGLING ���� : " + ZERGLING + " ��");
		System.out.println("2] HYDRA ���� : " + HYDRA + " ��");
		System.out.println("3] MUTAL ���� : " + MUTAL + " ��");
	}

}
