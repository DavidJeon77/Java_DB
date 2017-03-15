package computer.drive.impl;

import computer.drive.IDrive;

public class SSD implements IDrive{

	@Override
	public void swapIn() {
		System.out.println("SSD: 주 기억장치에 적재");
	}

	@Override
	public void swapDown() {
		System.out.println("SSD: 주 기억장치에 미적재");
	}



}
