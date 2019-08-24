package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tutionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;

	//constructor prompts user to enter student name and year
	Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student first name :");
		this.firstName=sc.nextLine();

		System.out.println("Enter student last name :");
		this.lastName=sc.nextLine();

		System.out.println("1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior\nEnter student class level :");
		this.gradeYear=sc.nextInt();

		setStudentId();
	}


	//generate a uniques id
	private void setStudentId()
	{
		id++;
		studentId=gradeYear+""+id;
	}

	//enroll in courses
	public void enroll()
	{
		boolean flag=false;
		do
		{
			System.out.print("Enter course to enroll (Q to quit) :");
			Scanner sc=new Scanner(System.in);
			String course = sc.nextLine();

			if(!course.equalsIgnoreCase("Q"))
			{
				courses=courses+"\n  "+course;
				tutionBalance=tutionBalance+costOfCourse;
			}
			else
			{
				flag=true;
			}
		}while(flag==false);

	}

	//view balance 
	public void viewBalance()
	{
		System.out.println("\nYour balance is : $"+tutionBalance);
	}


	//pay tution
	public void payTution()
	{
		viewBalance();
		System.out.print("Enter your payment $:");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thankyou for your payment of "+payment);
		viewBalance();
	}

	//show status
	public String toString()
	{
		return "\nName : "+firstName+" "+lastName+
				"\nGrade year : "+gradeYear+
				"\nStudent Id : "+studentId+
				"\nCourses enrolled : "+courses+
				"\nBalance : $"+tutionBalance;
	}
}
