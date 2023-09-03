package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub

			System.out.println("The student name is Raghavendra");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub

			System.out.println("The student dept is CS");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub

		
		System.out.println("The studnet iD is 16");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student std = new Student();
			std.collegeName();
			std.collegeCode();
			std.collegeRank();
			std.deptName();
	}

}
