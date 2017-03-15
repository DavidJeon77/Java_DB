package computer.ram.impl;

import computer.ram.IRam;

public class LgRam implements IRam{


	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGRAM에 적재");		
	}

	@Override
	public void sleepIn() {
		// TODO Auto-generated method stub
		System.out.println("LGRam에서 미적재");
		
	}

}
