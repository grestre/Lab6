
public class CheckingAccount extends BankAccount
{
	static double FEE = 0.15; 
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(getAccountNumber()+"-10");
	}
	public boolean withdraw(double amount)
	{
		boolean a = false; 
		if(amount>100 && getBalance()+FEE>=amount)
		{
			super.withdraw(amount+FEE);
			a=true; 
		}
		else if(getBalance()>=amount)
		{
			super.withdraw(amount+FEE);
			a=true; 
		}
		else
		{
			a=false; 
		}
		return a;
	}

}
