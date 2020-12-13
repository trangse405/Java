package entity;

public class Subject {

	private int subjectID;
	private String subjectName;
	private int numberOfCredit;
	private double durationTime;
	private int statusID;

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public double getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(double durationTime) {
		this.durationTime = durationTime;
	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

}
