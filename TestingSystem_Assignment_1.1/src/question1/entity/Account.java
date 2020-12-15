package question1.entity;

import java.util.Date;

public class Account {

	private int accountID;
	private String email;
	private String userName;
	private String fullName;
	private int departmentID;
	private int positionID;
	private Date createDate;

	public Account(int accountID, String email, String userName, String fullName, int departmentID, int positionID,
			Date createDate) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountID + "\t\t" + userName + "\t\t" + fullName + "\t\t\t" + email + "\t\t" + createDate;
	}
}
