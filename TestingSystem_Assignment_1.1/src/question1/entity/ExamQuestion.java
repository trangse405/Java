package question1.entity;

public class ExamQuestion {
	private int examID;
	private int questionID;

	public ExamQuestion() {
		// TODO Auto-generated constructor stub
	}

	public ExamQuestion(int examID, int questionID) {
		super();
		this.examID = examID;
		this.questionID = questionID;
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

}
