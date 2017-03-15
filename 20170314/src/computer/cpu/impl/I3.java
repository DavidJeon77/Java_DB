package computer.cpu.impl;

import computer.cpu.ICpu;

public class I3 implements ICpu {

	@Override
	public void use() {
		System.out.println("프로그램이 I3 Cpu 사용");
	}

	@Override
	public void unUse() {
		System.out.println("프로그램이 I3 Cpu 미사용.");
	}

}
