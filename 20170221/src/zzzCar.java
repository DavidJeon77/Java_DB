
public class zzzCar {
	
	// 1) car 클래스에서 사용할 데이터 정의
	String model;
	String maker;
	String makingContury;
	int makingYear;
	int topSpeed;
	double fuelEfficiency;
	
	// 2) car 클래스에서 사용할 기능 정의
	
	void printzzzCarInfo(){
		System.out.println("model - " + model);
		System.out.println("maker - " + maker);
		System.out.println("makingContury - " + makingContury);
		System.out.println("makingYear - " + makingYear);
		System.out.println("topSpeed - " + topSpeed + " km/h");
		System.out.println("fuelEfficiency - " + fuelEfficiency+" km/L");
	}
	
	void changeMakingYear(int changeMakingYear){
		System.out.println("Changing MakingYear");
		makingYear = changeMakingYear;
	}
	
	int getTopSpeed(){
		return topSpeed;
	}
	
	double getFuelEfficiency(){
		return fuelEfficiency;
	}
	
	String changeModel(String changeModel){
		model = changeModel;
		return model;
	}
	
	
	
	
	
	
	
	
	
	
	

}
