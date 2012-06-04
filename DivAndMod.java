/**
 * Author: Andy Pacher
 * Date: Mar 8th, 2011
 * Assignment: DivAndMod.java
 */

import java.util.Scanner;

public class DivAndMod {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first, second, firstDiv, firstMod, secondDiv, secondMod;
		
		System.out.print("Enter an integer: ");
		first = sc.nextInt();
		System.out.print("Enter a second integer: ");
		second = sc.nextInt();
		System.out.println();
		
		firstDiv = (first / second);
		firstMod = (first % second);
		secondDiv = (second / first);
		secondMod = (second % first);
		
		System.out.println( first+ "/" +second+ "=" + firstDiv );
		System.out.println( first+ "%" +second+ "=" + firstMod );
		System.out.println( first+ "/" +second+ "=" + secondDiv );
		System.out.println( first+ "%" +second+ "=" + secondMod );
	}
	
}
