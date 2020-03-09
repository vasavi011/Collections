//9/3/2020
package Array;

public class Student {
	int rollNumber;
	String studentName;
	float marks;
	byte grade;
	//inner class
	class Address
	{
		int houseNumber;
		String streetName;
		String landMark;
		String city;
		String state;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public byte getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	public void setGrade(byte grade) {
		this.grade = grade;
	}
	

}
