package computer.cpu.impl;

import computer.cpu.ICpu;

public class I5 implements ICpu {

	@Override
	public void use() {
		System.out.println("프로그램이 I5 Cpu 사용");
	}

	@Override
	public void unUse() {
		System.out.println("프로그램이 I5 Cpu 미사용");
	}

}
