package computer.cpu.impl;

import computer.cpu.ICpu;

public class I5 implements ICpu {

	@Override
	public void use() {
		System.out.println("���α׷��� I5 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("���α׷��� I5 Cpu �̻��");
	}

}
