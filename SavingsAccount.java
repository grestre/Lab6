
public class SavingsAccount extends BankAccount 
{
	double rate = 2.5; 
	static int savingsNumber = 0;
	String accountNumber;
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
		savingsNumber++;
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		this.rate=oldAccount.getInterestRate();
		this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
		savingsNumber++;
	}
	public double getInterestRate()
	{
		return rate;
	}
	public void postInterest()
	{
		deposit((getBalance() * (getInterestRate()/1200)));
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String toString()
	{
		//System.out.printf("Account Number %s has been created for %s \nInitial balance = $%.2f\",accountNumber,getOwner(),getBalance()");
		return "";
	}
}