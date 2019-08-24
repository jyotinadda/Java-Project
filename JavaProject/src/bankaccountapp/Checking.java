package bankaccountapp;

public class Checking extends Account{

	//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;



	//constructor to initialize checking account
	public Checking(String name, String SSN, double initDeposit)
	{
		super(name,SSN,initDeposit);
		accountNumber="2"+accountNumber;

		setDebitCard();
	}

	@Override
	public void setRates()
	{
		rate =getBaseRates()*0.15;
	}

	//list any methods specific to checking account
	private void setDebitCard()
	{
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN=(int)(Math.random()*Math.pow(10, 4));

		
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Your checking account features");
		System.out.println("Card : "+debitCardNumber);
		System.out.println("Pin : "+debitCardPIN);
		
	}



}
