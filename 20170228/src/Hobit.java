
public class Hobit implements IStarcraft {

	private final static int AAA = 50;
	private final static int BBB = 75;
	private final static int CCC = 150;

	private final static int DDD = 150;
	private final static int EEE = 200;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(
				resource + "원의 자원으로는 DDD " + (resource / DDD) + "개 또는 EEE " + (resource / EEE) + "개 를 지을 수 있다.");

	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 AAA " + (resource / AAA) + "마리 또는 BBB " + (resource / BBB)
				+ "마리 또는 CCC " + (resource / CCC) + "마리를 뽑을 수 있다.");

	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Hobit 종족이 건설할 수 있는 건물");
		System.out.println("1] DDD 가격 : " + DDD + "원");
		System.out.println("2] EEE 가격 : " + EEE + "원");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Hobit 종족이 생산할 수 있는 유닛");
		System.out.println("1]AAA의 가격 : " + AAA + "원");
		System.out.println("2]BBB의 가격 : " + BBB + "원");
		System.out.println("3]CCC의 가격 : " + CCC + "원");
	}

}
