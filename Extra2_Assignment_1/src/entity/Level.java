package entity;

public class Level {

	private int levelID;
	private String level;
	private int durationOfStudy;
	private int totalCredit;

	public int getLevelID() {
		return levelID;
	}

	public String getLevel() {
		return level;
	}

	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getDurationOfStudy() {
		return durationOfStudy;
	}

	public void setDurationOfStudy(int durationOfStudy) {
		this.durationOfStudy = durationOfStudy;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

}
