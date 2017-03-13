
public class Hobit implements IStarcraft {

	private final static int AAA = 50;
	private final static int BBB = 75;
	private final static int CCC = 150;

	private final static int DDD = 150;
	private final static int EEE = 200;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(
				resource + "���� �ڿ����δ� DDD " + (resource / DDD) + "�� �Ǵ� EEE " + (resource / EEE) + "�� �� ���� �� �ִ�.");

	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "���� �ڿ����δ� AAA " + (resource / AAA) + "���� �Ǵ� BBB " + (resource / BBB)
				+ "���� �Ǵ� CCC " + (resource / CCC) + "������ ���� �� �ִ�.");

	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Hobit ������ �Ǽ��� �� �ִ� �ǹ�");
		System.out.println("1] DDD ���� : " + DDD + "��");
		System.out.println("2] EEE ���� : " + EEE + "��");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Hobit ������ ������ �� �ִ� ����");
		System.out.println("1]AAA�� ���� : " + AAA + "��");
		System.out.println("2]BBB�� ���� : " + BBB + "��");
		System.out.println("3]CCC�� ���� : " + CCC + "��");
	}

}
