package com.bridgelabz.gambling;

public class GamblingSimulator {
	public static final int EveryDayStake = 100;
	public static final int bet = 1;
	
	public static void main(String[] args) {
		int Stake = EveryDayStake;
		
		while (Stake>50 && Stake<150) {
			int rand = (int)Math.floor(Math.random()*10) % 2;
			if (rand==bet) {
				Stake = Stake + 1;
				System.out.println("You Win");
			}
			else {
				Stake = Stake - 1;
				System.out.println("You Lose");
			}	
		}
		if(Stake==50){
			System.out.println("Player resigned due to loosing "+Stake);
		}
		else {
		System.out.println("Player resigned due to winning " +Stake);
		}

	}

}
