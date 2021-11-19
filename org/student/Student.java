package org.student;

public class Student extends org.department.Department{
	public void studentName(String studentName) {
		System.out.println("StudentName: "+studentName);
		
	}
	public void studentGrade(double studentGrade) {
		System.out.println("StudentGrade: "+studentGrade);
	}
	public void studentId(double studentId) {
		System.out.println("StudentId: "+studentId);
	}
	public static void main(String[]args) {
		Student scholar = new Student();
		scholar.studentName("Pradeepkumar N");
		scholar.studentId(15);
		scholar.studentGrade(8.5);
		scholar.deptName("Electrical Electronics Engineering");
		scholar.collegeName("Adhiparasakthi college of Engineering");
		scholar.collegeCode(1501);
		scholar.collegeRank(45);
		
	}

}
