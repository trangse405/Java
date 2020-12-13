package business.Student;

import entity.Student;

public interface StudentFunction {
	public boolean registerClass(int studentID, int classID);

	public boolean cancelClass(int studentID, int classID);

	public boolean registerClub(int studentID, int clubID);

	public boolean cancelClub(int studentID, int clubID);
	
	public Student viewProfile(int studentID);
 
}
