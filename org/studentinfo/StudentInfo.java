package org.studentinfo;

public class StudentInfo {
	public void getStudentsInfo(int id) {
		System.out.println("Student ID: "+id);
		System.out.println("*************");
	}
	public void getStudentsInfo(String name) {
		System.out.println("Student Name: "+name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Email: "+email);
		System.out.println("PhoneNumber: "+phonenumber);
	}

	public static void main(String[] args) {
           StudentInfo student = new StudentInfo();
           student.getStudentsInfo(15);
           student.getStudentsInfo("Pradeepkumar N");
           student.getStudentInfo("npspradeep1999@gmail.com",224859);
           
	}

}
