package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		
		
		//Ask how many new user we want to add
		System.out.println("Enter number of new students to enroll :");
		Scanner sc=new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		
		Student[] students=new Student[noOfStudents];
		
		
		// create number of new students
		for(int i=0;i<noOfStudents;i++)
		{
			students[i]=new Student();
			students[i].enroll();
			students[i].payTution();
		}
		
		for(Student s:students)
		{
			System.out.println(s.toString());
		}
	}
}
