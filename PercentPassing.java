/**
 * Name: Andy Pacher
 * Date: Apr 12, 2011
 * Assignment: PercentPassing.java
 */

import java.util.Scanner;

public class PercentPassing {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int testScore, passingScores, percentPass, totalScores;
	    double decimalPass;
	    passingScores = 0;
	    totalScores = 0;
		
		do {
			System.out.println("Enter test scores. Enter a number over 9000 to stop");
			testScore = sc.nextInt();
			
			if  (testScore > 70){
				if (testScore <= 100)
					passingScores +=1.0;
					totalScores += 1;
				
			}else 
				totalScores += 1;	
				
		}while (testScore <= 9000);
		totalScores -=1;
		
		decimalPass = passingScores /(double) totalScores;
		percentPass = (int) ((decimalPass * 100) +0.5 );
		
		if (totalScores > 0){
			System.out.println("Your percentage of passing scores is: " +percentPass+ "%" );
		}else
			System.out.println("You dont have any pancake mix");
	
		}
}