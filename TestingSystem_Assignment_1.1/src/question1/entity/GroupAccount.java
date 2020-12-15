package question1.entity;

import java.util.Date;

public class GroupAccount {

	private int groupID;
	private int accountID;
	private Date joinDate;

	public GroupAccount() {
		// TODO Auto-generated constructor stub
	}

	public GroupAccount(int groupID, int accountID, Date joinDate) {
		super();
		this.groupID = groupID;
		this.accountID = accountID;
		this.joinDate = joinDate;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
