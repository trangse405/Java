package entity;

import java.util.List;

public class Club {
	private int clubID;
	private String clubName;
	private String clubDescription;
	private List<Student> listStudent;

	public int getClubID() {
		return clubID;
	}

	public void setClubID(int clubID) {
		this.clubID = clubID;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getClubDescription() {
		return clubDescription;
	}

	public void setClubDescription(String clubDescription) {
		this.clubDescription = clubDescription;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

}
