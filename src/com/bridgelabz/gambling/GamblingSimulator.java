package com.bridgelabz.gambling;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {
	public static final int EveryDayStake = 100;
	public static final int bet = 1;
	
	public static void main(String[] args) {
		int Stake = EveryDayStake;
		int month = 1;
		int day = 1;
		int UnluckyDay = 1;
		int LuckyDay = 1;
		int UnluckyMonth= 1;
		int LuckyMonth = 1;
		int LuckyDayMoney = EveryDayStake;
		int UnluckyDayMoney = EveryDayStake;
		int MoneyEarnedinMonth = 0;

		while (month<=12) {
			day = 1;			
			while(day<=30) {
				Stake = EveryDayStake;
				Random rand = new Random();
	            int dailyGamePlayed = rand.nextInt(10);
	            
				for (int i = 0; i < dailyGamePlayed; i++) {
				
					int randcheck = (int)Math.floor(Math.random()*10) % 2;
					if (randcheck==bet) 
						Stake = Stake + 1;		
					else 
						Stake = Stake - 1;
				}			
				day++;
				MoneyEarnedinMonth = MoneyEarnedinMonth + Stake;
			}
			if( MoneyEarnedinMonth > Stake*30) {
				System.out.println("You have won in the month "+month+ " with  money "+MoneyEarnedinMonth+" would you like to keep playing? 1 for no, 2 for yes ");			
				Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                month++;
                if(choice == 1)
                	break;
                else if (choice == 2){
                	continue;
                }          
			}
			else {
				System.out.println("You have lost in the month "+month+ " with  money "+MoneyEarnedinMonth);			
			}		
		}
	}
}