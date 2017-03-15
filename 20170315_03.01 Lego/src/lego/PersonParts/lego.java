package lego.PersonParts;

import lego.PersonParts.Body.IBody;
import lego.PersonParts.Head.IHead;
import lego.PersonParts.Legs.ILegs;
import lego.PersonParts.arms.IArm;

public class lego {

	private IHead head;
	private IBody body;
	private IArm arm;
	private ILegs legs;

	public lego(IHead head, IBody body, IArm arm, ILegs legs) {
		this.head = head;
		this.body = body;
		this.arm = arm;
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "lego [head=" + head.item() + ", body=" + body + ", arm=" + arm + ", legs=" + legs + "]";
	}

	public void changeHead(IHead head) {
		this.head = head;
	}

}
