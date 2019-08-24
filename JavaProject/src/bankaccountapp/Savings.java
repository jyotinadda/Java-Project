package bankaccountapp;

public class Savings extends Account{

	//list properties specific to Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	//constructor to initialize Savings account
	public Savings(String name, String SSN, double initDeposit)
	{
		super(name,SSN,initDeposit);
		accountNumber="1"+accountNumber;
		
		
		savFeatures();
	}
	
	@Override
	public void setRates()
	{
		rate=getBaseRates()-0.25;
	}
	//list any methods specific to Savings account
	private void savFeatures()
	{
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
		
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Your savings account features");
		System.out.println("Safety Deposit Box Id : "+safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key : "+safetyDepositBoxKey);
	}
	
		
}
