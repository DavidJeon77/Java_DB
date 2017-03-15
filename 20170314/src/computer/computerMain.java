package computer;

import computer.cpu.*;
import computer.cpu.impl.I3;
import computer.drive.impl.*;
import computer.ram.impl.*;

public class computerMain {

	public static void main(String[] args) {

		Computer com = new Computer(new I3(), new SamsungRam(), new HDD());
		
		com.ready();
		com.running();
		com.asleep();
		com.suspended_ready();
		com.suspended_blocked();
		
	}

}
