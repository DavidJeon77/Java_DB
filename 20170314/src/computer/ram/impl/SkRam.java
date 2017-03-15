package computer.ram.impl;

import computer.ram.IRam;

public class SkRam implements IRam{

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		
		System.out.println("SkRam에 적재");
	}

	@Override
	public void sleepIn() {
		// TODO Auto-generated method stub
		
		System.out.println("SkRam에서 미적재");
	}
	
}
