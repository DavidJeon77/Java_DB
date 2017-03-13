public class main02 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setNum1(10);
		calc.setNum2(20);

		calc.runAdd();

		int addResult = calc.getResult();
		System.out.println("µ¡¼À°á°ú : " + addResult);

	}
}
