package computer.cpu.impl;

import computer.cpu.ICpu;

public class I3 implements ICpu {

	@Override
	public void use() {
		System.out.println("���α׷��� I3 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("���α׷��� I3 Cpu �̻��.");
	}

}
