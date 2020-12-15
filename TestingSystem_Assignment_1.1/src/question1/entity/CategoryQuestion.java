package question1.entity;

public class CategoryQuestion {
	private int categoryID;
	private String categoryName;

	public CategoryQuestion() {
		// TODO Auto-generated constructor stub
	}

	public CategoryQuestion(int categoryID, String categoryName) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
