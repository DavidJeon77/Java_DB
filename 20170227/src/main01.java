public class main01 {

	public static void main(String[] args) {
		House2 slideHouse2 = new House2(new SlideDoor2());
		House2 hingedHouse2 = new House2(new HingedDoor2());
		House2 revolvingHouse2 = new House2(new RevolvingDoor());

		slideHouse2.in();
		slideHouse2.out();
		System.out.println();

		hingedHouse2.in();
		hingedHouse2.out();
		System.out.println();

		revolvingHouse2.in();
		revolvingHouse2.out();
		System.out.println();

	}

}
