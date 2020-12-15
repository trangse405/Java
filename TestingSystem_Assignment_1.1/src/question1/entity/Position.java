package question1.entity;

import question1.entity.enumValue.PositionName;

public class Position {

	private int positionID;
	private PositionName positionName;

	public Position() {
	}

	public Position(int positionID, PositionName positionName) {
		super();
		this.positionID = positionID;
		this.positionName = positionName;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

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
		return "\t" + positionID + "\t " + positionName;
	}
}
