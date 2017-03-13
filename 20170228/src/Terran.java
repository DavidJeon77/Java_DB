public class Terran implements IStarcraft {
	private final static int MARINE = 50;
	private final static int GHOST = 75;
	private final static int TANK = 150;

	private final static int STAR_BARRUCK = 150;
	private final static int FACTORY = 200;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 STAR_BARRUCK "
				+ (resource / STAR_BARRUCK) + "개 또는 FACTORY "
				+ (resource / FACTORY) + "개 를 지을 수 있다.");

		// System.out.println(resource + "원의 자원으로 건설할 수 있는 STAR_BARRUCK의 수 : " +
		// (resource / STAR_BARRUCK) + "\t 남은 자원 : "
		// + (resource % STAR_BARRUCK));
		// System.out.println(resource + "원의 자원으로 건설할 수 있는 FACTORY의 수 : " +
		// (resource / FACTORY) + "\t\t 남은 자원 : "
		// + (resource % FACTORY));
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 MARINE " + (resource / MARINE)
				+ "마리 또는 GHOST " + (resource / GHOST) + "마리 또는 TANK "
				+ (resource / TANK) + "마리를 뽑을 수 있다.");
		// System.out.println(resource + "원의 자원으로 생산할 수 있는 MARINE의 수 : " +
		// (resource / MARINE) + "\t\t 남은 자원 : "
		// + (resource % MARINE));
		// System.out.println(
		// resource + "원의 자원으로 생산할 수 있는 GHOST의 수 : " + (resource / GHOST) +
		// "\t\t 남은 자원 : " + (resource % GHOST));
		// System.out.println(
		// resource + "원의 자원으로 생산할 수 있는 TANK의 수 : " + (resource / TANK) + "\t 남은
		// 자원 : " + (resource % TANK));
	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Terran 종족이 건설할 수 있는 건물");
		System.out.println("1] Star_Barruck 가격 : " + STAR_BARRUCK + "원");
		System.out.println("2] FACTORY 가격 : " + FACTORY + "원");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Terran 종족이 생산할 수 있는 유닛");
		System.out.println("1]MARINE의 가격 : " + MARINE + "원");
		System.out.println("2]GHOST의 가격 : " + GHOST + "원");
		System.out.println("3]TANK의 가격 : " + TANK + "원");

	}

}