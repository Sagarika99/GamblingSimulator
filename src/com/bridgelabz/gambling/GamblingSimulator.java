package com.bridgelabz.gambling;

public class GamblingSimulator {
	public static final int EveryDayStake = 100;
	public static final int bet = 1;
	
	public static void main(String[] args) {
		 int rand = (int)Math.floor(Math.random()*10)%2;
		
		if (rand==bet) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}		
	}

}
