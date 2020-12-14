package question1.entity;

public class Department {

	private int departmentID;
	private String departmentName;

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\t" + departmentID + "\t " + departmentName;
	}
}
