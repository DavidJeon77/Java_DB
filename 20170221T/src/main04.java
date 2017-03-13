public class main04 {

	public static void main(String[] args) {
		int num = 2;
		// switch(변수)
		// case문에 break가 없으면 아랫쪽 case 문까지 한꺼번에 실행 된다.

		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;
		case 3:
			System.out.println("num은 3입니다.");
			break;
		default:
			System.out.println("그 외...");
		}

	}

}
