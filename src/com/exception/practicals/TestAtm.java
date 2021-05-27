package com.exception.practicals;

public class TestAtm {

	public static void main(String[] args) {
		Atm a = new Atm();
		Card c = new Card();
		c.setAccNum("123345");
		c.setBalance(10);
		try {
			a.withDraw(c, 10000);
		} catch (notEnoughBalException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
