import java.util.Scanner;

public class StarcraftMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kind = 0;
		int select = 0;
		int mineral = 0;
		Starcraft star = new Starcraft();

		while (kind != 5) {

			System.out.println("������ �����ϼ���");
			System.out.println("1)����,2)�׶�,3)�����佺,4)��ũ 5)����");
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
				System.out.println("����");
				continue;
			default:
				System.out.println("�߸��� �� �Է�");
				continue;
			}

			System.out.println("1) �ǹ�,2) ����");
			select = scan.nextInt();
			System.out.println("�����Ͻ� �ڿ��� �Է��ϼ���");
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
				System.out.println("�߸��� �� �Է�");
				continue;
			}

		}
		scan.close();
	}

}
