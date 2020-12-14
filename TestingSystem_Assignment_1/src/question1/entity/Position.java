package question1.entity;

public class Position {

	private int positionID;
	private PositionName positionName;

	public int getpositionID() {
		return positionID;
	}

	public void setpositionID(int positionID) {
		this.positionID = positionID;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\t" + positionID + "\t " + positionName;
	}
}
