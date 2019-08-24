package bankaccountapp;
import java.util.LinkedList;
import java.util.List;


public class BankAccountApp {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		
		String file="C:\\Users\\Jyoti\\eclipse-workspace\\JavaProject\\JavaProject.csv";
		
		System.out.println("Hi there");
		List<String[]> newAccountHolder=utilities.CSV.read(file);
		
		for(String[] s:newAccountHolder)
		{
			String name=s[0];
			String ssn=s[1];
			String accountType=s[2];
			double initDeposit=Double.parseDouble(s[3]);
			
			//System.out.println(name+"  "+ssn+"  "+accountType+"  "+initDeposit);
			
			if(accountType.equalsIgnoreCase("Savings"))
			{
				accounts.add(new Savings(name,ssn,initDeposit));
			}
			else if(accountType.equalsIgnoreCase("Checking"))
			{
				accounts.add(new Checking(name,ssn,initDeposit));
			}
			else
			{
				System.out.println("Error reading account type");
			}
		}
		
	
		for(Account a:accounts)
		{
			a.showInfo();
		}
		
		
		/*Checking chkacc1= new Checking("Jyoti Nadda","32145687",1500);
		Savings savacc1= new Savings("Jyoti Nadda","123456789",2500);
		
		chkacc1.showInfo();
		
		System.out.println("**************");
		savacc1.showInfo();
		
		savacc1.compound();*/
	}
}
