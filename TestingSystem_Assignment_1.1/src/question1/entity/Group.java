package question1.entity;

import java.util.Date;

public class Group {
	private int groupID;
	private String groupName;
	private int creatorID;
	private Date createDate;

	public Group() {
		// TODO Auto-generated constructor stub
	}

	public Group(int groupID, String groupName, int creatorID, Date createDate) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
