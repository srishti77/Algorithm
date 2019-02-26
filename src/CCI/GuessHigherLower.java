package CCI;

import java.util.Random;

public class GuessHigherLower {
	
	public static void main(String s[]) {
		
		GuessHigherLower guess = new GuessHigherLower();
		System.out.println(guess.getMoneyAmount(10));
		
	}
	
	 public int getMoneyAmount(int n) {
		 
		 Random random = new Random();
		 int pick = random.nextInt(n);
		
		 int lowerValue =1;
		 int upperValue =n;
		 int amount =0;
		 while(true) {
			 int getRandom = random.nextInt(upperValue -lowerValue) +lowerValue;
		
			 if(getRandom == pick) {
				 break;
			 }
			 
			 else if(getRandom < pick) {
				 amount+= getRandom;
				 lowerValue = getRandom;
			 }
			 
			 else {
				 amount += getRandom;
				 upperValue = getRandom;
			 }
		 }
		 
		 return amount;
		 
		 
	 }
}
