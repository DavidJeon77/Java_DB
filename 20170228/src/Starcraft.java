public class Starcraft {
	IStarcraft iStarcraft = null;

	/*
	 * public Starcraft(){}
	 * 
	 * public Starcraft(IStarcraft iStarcraft){ this.iStarcraft = iStarcraft; }
	 */

	public void setiStarcraft(IStarcraft iStarcraft) {
		this.iStarcraft = iStarcraft;
	}

	public void building(int resource) {
		iStarcraft.buildingCalc(resource);

	}

	public void unit(int resource) {
		iStarcraft.unitCalc(resource);
	}

	public void PbuildingInfo() {
		iStarcraft.printBuildingInfo();
	}

	public void Punitinfo() {
		iStarcraft.printUnitInfo();
	}

}
