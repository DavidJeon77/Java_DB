package computer.drive.impl;

import computer.drive.IDrive;

public class HDD implements IDrive {

	@Override
	public void swapIn() {
		System.out.println("HDD: 주 기억장치에 적재");
	}

	@Override
	public void swapDown() {
		System.out.println("HDD: 주 기억장치에서 미적재");
	}


}
