package com.exception.practicals;

public class Atm {

	public double withDraw(Card c,double amt) throws notEnoughBalException
	{
		if(c==null)
			throw new IllegalArgumentException("card doesn't exist..");
		if(amt<0)
			throw new IllegalArgumentException("Insufficient balance");
		if(amt>c.getBalance())
			throw new notEnoughBalException("no sufficient balance to withdraw");
		return c.getBalance();
	}
}
