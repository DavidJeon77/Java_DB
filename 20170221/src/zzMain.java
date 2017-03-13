public class zzMain {

	public static void main(String[] args) {
		zzzCar car = new zzzCar();

		car.model = "supercar";
		car.maker = "supermotors";
		car.makingContury = "fiji";
		car.makingYear = 2017;
		car.topSpeed = 300;
		car.fuelEfficiency = 3.2;

		car.printzzzCarInfo();

		car.changeMakingYear(2016);

		int zzzCarTopSpeed = car.getTopSpeed();
		System.out.println("zzzCar`s TopSpeed is " + zzzCarTopSpeed + " km/h");

		double zzzCarFuelEfficiency = car.getFuelEfficiency();
		System.out.println("zzzCar`s FuelEfficiency is " + zzzCarFuelEfficiency
				+ " km/L");

		String carModel = car.changeModel("SuperSuperCar");
		System.out.println(carModel);
		System.out.println();

		car.printzzzCarInfo();

	}

}
