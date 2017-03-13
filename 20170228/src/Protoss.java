public class Protoss implements IStarcraft {

	final static int GATEWAY = 150;
	final static int STARGATE = 200;

	final static int ZEALOT = 100;
	final static int DRAGOON = 125;
	final static int SCOUT = 225;

	@Override
	public void buildingCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 GATEWAY " + resource / GATEWAY
				+ "개 또는 STARGATE " + resource / STARGATE + "개를 지을 수 있다.");
	}

	@Override
	public void unitCalc(int resource) {
		System.out.println(resource + "원의 자원으로는 질럿 " + resource / ZEALOT
				+ "개 또는 드라군" + resource / DRAGOON + "개 또는 스카웃 " + resource
				/ SCOUT + "개 뽑을 수 있다.");
	}

	@Override
	public void printBuildingInfo() {
		System.out.println("Protoss 종족이 건설할 수 있는 건물");
		System.out.println("1] GATEWAY 가격 : " + GATEWAY + "원");
		System.out.println("2] STARGATE 가격 : " + STARGATE + "원");
	}

	@Override
	public void printUnitInfo() {
		System.out.println("Protoss 종족이 생산할 수 있는 유닛");
		System.out.println("1] ZEALOT 가격 : " + ZEALOT + "원");
		System.out.println("2] DRAGOON 가격 : " + DRAGOON + "원");
		System.out.println("3] SCOUT 가격 : " + SCOUT + "원");
	}

}
