package kr.co.smh.electronic.impl;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.IComputer;
import kr.co.smh.electronic.able.IAble;
import kr.co.smh.electronic.able.impl.PortableImpl;

public class Notebook extends ElectronicMachine implements IComputer{

	public Notebook() {
		super(ElectronicMachine.POWER_BATTERY, new PortableImpl());
	}

	@Override
	public void doInternet() {
		System.out.println("��Ʈ������ ���ͳ� �ϱ�");
	}

	@Override
	public void doSendMail() {
		System.out.println("��Ʈ������ ���� ������");
	}

	@Override
	public void showCanDo() {
		doInternet();
		doSendMail();
	}

}