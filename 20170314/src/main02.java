import example.building.Building;
import example.building.door.impl.HingedDoor;
import example.building.door.impl.SlideDoor;

public class main02 {
	public static void main(String[] args) {
		Building building1 = new Building(new HingedDoor());
		building1.in();
		building1.out();

		Building building2 = new Building(new SlideDoor());
		building2.in();
		building2.out();

	}
}
