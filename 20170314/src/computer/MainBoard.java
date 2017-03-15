package computer;

import computer.cpu.impl.ICpu;
import computer.drive.IDrive;
import computer.ram.IRam;

public class MainBoard implements IComputer{

	private ICpu cpu;
	private IRam ram;
	private IDrive drive;
	
	public void assemble(ICpu cpu, IRam ram, IDrive drive) {
		this.cpu = cpu;
		System.out.println("CPU ÀåÂø");

		this.ram = ram;
		System.out.println("RAM ÀåÂø");

		this.drive = drive;
		System.out.println("DRIVE ÀåÂø");
		System.out.println();
	}


	@Override
	public void function() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
