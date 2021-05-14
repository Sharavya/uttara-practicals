package oop.state.behaviour.practicals3;

public class Account {

	private double balance;
	private String accNum ;
	
	public void setBalance(double depo)
	{
		if(depo>0)
			balance = depo;
		else
			System.out.println("...~error deposit failed!!~....");
	}
	public double getBalance()
	{
		return balance;
	}
	public void setAccNum(String accountNum)
	{
		if(accountNum !=null)
			accNum = accountNum;
		else
			System.out.println("...account number is invalid...");
	}
	public void withDraw(double amount)
	{
		if(balance>amount && amount>0)
			balance = balance-amount;
		else
			System.out.println("There is no sufficient balance...");
	}
	public String getAccNum()
	{
		return accNum;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
			balance = balance+amount;
		else
			System.out.println("...deposit failed...");
		
	}
	public void checkBalance(String accNum)
	{
		if(accNum!=null)
			 System.out.println("balance = "+balance);
		else
			System.out.println("provide proper account number");
			
			
	}
}
