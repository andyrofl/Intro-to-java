/**
 * Author: Andy Pacher
 * Date: Apr 4th, 2011
 * Assignment: Eggs.java
 */

import java.text.NumberFormat;
import java.util.Scanner;
	
public class Eggs {
	public static void main(String[] args){
		
		final int DOZEN = 12;
		int singlesPurchased, eggsPurchased, dozensPurchased;
		double price, finalPrice;
		Scanner jeff = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Enter the number of eggs purchased: ");
		eggsPurchased = jeff.nextInt();
		
		dozensPurchased = eggsPurchased / DOZEN;
		singlesPurchased = eggsPurchased % DOZEN;
		
		if (dozensPurchased < 4)
			price = (0.50);
		else if (dozensPurchased < 6)
			price = (0.45);
		else if (dozensPurchased < 11)
			price = (0.40);
		else 
			price = (0.35);
		
		finalPrice = (price * dozensPurchased)+((1.0/DOZEN * price) * singlesPurchased);

		System.out.println("The price is: " + money.format(finalPrice));
		
	}
}
