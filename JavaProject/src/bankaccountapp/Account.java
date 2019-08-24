package bankaccountapp;

public abstract class Account implements IBaseRate{
	//list common properties for savings and checking accounts
	private String name;
	private String ssn;
	private double balance;
	protected double rate;
	protected String accountNumber;
	protected static int index=10000;
	
	//constructor to set base properties and initialize account
	public Account(String name, String SSN, double initDeposit)
	{
		this.name=name;
		this.ssn=SSN;
		this.balance=initDeposit;
		
		//System.out.println("Name :"+name+"  ssn : "+ssn+"  balance"+balance);
		
		index++;
		//Set account number
		this.accountNumber=setAccountNumber();
				
		setRates();
	}
	
	public abstract void setRates();
	
	public String setAccountNumber()
	{
		String lastTwoOfSsn =ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID=index;
		int randomNumber =(int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn+index+randomNumber;
		
	}
	
	public void compound()
	{
		double accruedInterest =balance* (rate/100);
		System.out.println("Accrued interest: $"+accruedInterest);
		balance=balance+accruedInterest;
		printBalance();
	}
	//list common methods
	
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		System.out.println("Your balance is now "+balance);
	}
	public void withdraw(double amount)
	{
		balance=balance-amount;
		System.out.println("Withdrawing $"+amount);
		System.out.println("Your balance is now "+balance);
	}
	public void transfer(String toWhere, double amount)
	{
		balance=balance-amount;
		System.out.println("transfering $"+amount+" to "+toWhere);
		System.out.println("Your balance is now "+balance);
	}
	
	public void printBalance()
	{
		System.out.println("Your balance is now "+balance);
	}
	public void showInfo()
	{
		System.out.println(
				"\nNAME : "+name +
				"\nAccount Number : "+accountNumber+
				"\nBalance :" +balance+
				"\nRate :"+rate+"%");
	}
}
