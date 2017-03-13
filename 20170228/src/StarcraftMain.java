import java.util.Scanner;

public class StarcraftMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kind = 0;
		int select = 0;
		int mineral = 0;
		Starcraft star = new Starcraft();

		while (kind != 5) {

			System.out.println("종족을 선택하세요");
			System.out.println("1)저그,2)테란,3)프로토스,4)워크 5)종료");
			kind = scan.nextInt();
			switch (kind) {
			case 1:
				star.setiStarcraft(new Zerg());
				break;
			case 2:
				star.setiStarcraft(new Terran());
				break;
			case 3:
				star.setiStarcraft(new Protoss());
				break;
			case 4:
				star.setiStarcraft(new Warc());
				break;
			case 5:
				System.out.println("종료");
				continue;
			default:
				System.out.println("잘못된 수 입력");
				continue;
			}

			System.out.println("1) 건물,2) 유닛");
			select = scan.nextInt();
			System.out.println("보유하신 자원을 입력하세요");
			mineral = scan.nextInt();
			switch (select) {
			case 1:
				star.PbuildingInfo();
				star.building(mineral);
				break;
			case 2:
				star.Punitinfo();
				star.unit(mineral);
				break;
			default:
				System.out.println("잘못된 수 입력");
				continue;
			}

		}
		scan.close();
	}

}
