public class Zerg implements IStarcraft {

	// 건물
	final static int HATCHERY = 300; // 1. 해처리
	final static int LARE = 400; // 2. 레어

	// 유닛
	final static int ZERGLING = 50; // 1. 저글링
	final static int HYDRA = 75; // 2. 히드라
	final static int MUTAL = 100; // 3. 뮤탈

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 헤저리 " + (resource / HATCHERY)
				+ "개 레어 " + (resource / LARE) + "개를 지을 수 있다.");
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 저글링 " + (resource / ZERGLING)
				+ "마리 히드라 " + (resource / HYDRA) + "마리 뮤탈 "
				+ (resource / MUTAL) + "마리를 만들 수 있다.");

	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Zerg 종족이 건설할 수 있는 건물");
		System.out.println("1] HATCHERY 가격 : " + HATCHERY + " 원");
		System.out.println("2] LARE 가격 : " + LARE + " 원");

	}

	@Override
	public void printUnitInfo() {
		System.out.println("Zerg 종족이 생산할 수 있는 유닛");
		System.out.println("1] ZERGLING 가격 : " + ZERGLING + " 원");
		System.out.println("2] HYDRA 가격 : " + HYDRA + " 원");
		System.out.println("3] MUTAL 가격 : " + MUTAL + " 원");
	}

}
