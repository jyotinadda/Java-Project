package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String email;
	private String companyPrefix="ayecompany.com";

	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;


		//call a method that asks for department
		this.department=setDepartment();

		//call a method that generates a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is " +this.password);
		
		//Combine elements to generate email
		this.email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companyPrefix;
		
	}

	//Ask for department
	private String setDepartment()
	{
		System.out.println("New Worker: "+firstName+"\nEnter the DEPARTMENT CODES\nEnter the department :\n 1. for Sales\n2. for Development\n3. for Accounting\n0. for none\nEnter department code :");
		Scanner sc=new Scanner(System.in);
		int depChoice= sc.nextInt();
		if(depChoice==1)		{			return "sales";		}
		else if(depChoice==2)		{			return "dev";		}
		else if(depChoice==3)		{			return "acc";		}
		else { return "";}
	}

	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand =(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}

	//set mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}


	//set alternate name email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password=password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showInfo()
	{
		return "\nName :"+firstName+" "+lastName+
				"\nCompany Email :"+ email+
				"\nMailbox capacity :"+mailboxCapacity+"mb";
	}
}
