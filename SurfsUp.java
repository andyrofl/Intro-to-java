/**
 * Author: Andy Pacher
 * Date: Mar 21st, 2011
 * Assignment: SurfsUp.java
 */

import java.util.Scanner;

public class SurfsUp {
	public static void main(String[] args){
		final int YEAH = 6;
		Scanner confeduracahh = new Scanner(System.in);
		int waveHeight;
		
		System.out.println("What is t3h wave height?");
		waveHeight = confeduracahh.nextInt();
		if (waveHeight >= YEAH)
		  System.out.println("Its probs a good day to be skateboarding on the water");
		else 
			System.out.println("if you go surfing, you will probs be liek OMG NO WAVEZZ!!1!!!");
		
	}
	
}
