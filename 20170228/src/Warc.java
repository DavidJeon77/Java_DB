public class Warc implements IStarcraft {

	int result1 = 0;
	int result2 = 0;
	int result3 = 0;

	// 건물 가격
	final static int WAR_BARRUCK = 200;
	final static int CRYPT = 250;

	// 유닛 가격
	final static int FOOTMAN = 70;
	final static int ORC = 80;
	final static int GHOUL = 110;

	// 지을 수 있는 건물 수 계산 및 출력
	@Override
	public void buildingCalc(int resource) {
		result1 = resource / WAR_BARRUCK;
		result2 = resource / CRYPT;
		System.out.println(resource + "원의 자원으로는 WAR_BARRUCK" + result1
				+ "개 또는 CRYPT " + result2 + "개를 지을 수 있다.");
	}

	// 뽑을 수 있는 유닛 수 계산 및 출력
	@Override
	public void unitCalc(int resource) {
		result1 = resource / FOOTMAN;
		result2 = resource / ORC;
		result3 = resource / GHOUL;
		System.out.println(resource + "원의 자원으로는 FOOTMAN " + result1
				+ "명 또는 ORC " + result2 + "마리 또는 GHOUL " + result3
				+ "마리를 뽑을 수 있다.");

	}

	// 해당 종족이 지을 수 있는 건물 종류
	@Override
	public void printBuildingInfo() {
		System.out.println("워크 종족이 지을 수 있는 건물");
		System.out.println("1] WAR_BARRUCK 가격 : " + WAR_BARRUCK + "원");
		System.out.println("2] CRYPT 가격 : " + CRYPT + "원");

	}

	// 해당 종족이 뽑을 수 있는 유닛 종류
	@Override
	public void printUnitInfo() {
		System.out.println("워크 종족이 생산할 수 있는 유닛");
		System.out.println("1] FOOTMAN 가격 : " + FOOTMAN + "원");
		System.out.println("2] ORC 가격 : " + ORC + "원");
		System.out.println("3] GHOUL 가격 : " + GHOUL + "원");

	}

}