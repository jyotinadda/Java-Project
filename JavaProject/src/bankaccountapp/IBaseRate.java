package bankaccountapp;

public interface IBaseRate {
	//Write a method that returns the base rates
	default double getBaseRates()
	{
		return 2.5;
	}
}
