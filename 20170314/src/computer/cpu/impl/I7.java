package computer.cpu.impl;

import computer.cpu.ICpu;

public class I7 implements ICpu {

	@Override
	public void use() {
		System.out.println("���α׷��� I7 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("���α׷��� I7 Cpu �̻��");
	}

}
