
public class HouseDog extends Dog {

	public HouseDog(String name) {
		this.setName(name);
	}

	public HouseDog(int type) {
		if (type == 1) {
			this.setName("FFoyou");
		} else if (type == 2) {
			this.setName("happy");
		}
	}

	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}

	public static void main(String[] args) {
		HouseDog happy = new HouseDog("happy");
		HouseDog FFoyou = new HouseDog(1);
		System.out.println(happy.name);
		System.out.println(FFoyou.name);
	}

}
