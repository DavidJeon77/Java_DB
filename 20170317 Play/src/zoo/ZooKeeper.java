package zoo;

public class ZooKeeper {
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getName());
	}

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.setName("tiger");

		Lion lion = new Lion();
		lion.setName("lion");

		ZooKeeper zooKeeper = new ZooKeeper();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);

	}

}
