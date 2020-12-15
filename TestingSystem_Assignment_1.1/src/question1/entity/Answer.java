package question1.entity;

public class Answer {

	private int answerID;
	private String content;
	private int questionID;
	private boolean isCorrect;

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerID, String content, int questionID, boolean isCorrect) {
		super();
		this.answerID = answerID;
		this.content = content;
		this.questionID = questionID;
		this.isCorrect = isCorrect;
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

}
