package computer.ram.impl;

import computer.ram.IRam;

public class SamsungRam implements IRam{


	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungRAM에 적재");
		
	}

	@Override
	public void sleepIn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungRAM에서 미적재");
		
	}

}
