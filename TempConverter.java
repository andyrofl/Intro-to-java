/**
 * Author: Andy Pacher
 * Date: Mar 7th, 2011
 * Assignment: TempConverter.java
 */

import java.util.Scanner;

public class TempConverter {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double fahrenheit, celsius;
		double CONVERSION_RATE = 5.0 / 9;
		
		System.out.print("Enter Fahrenheit temperature: ");
		fahrenheit = sc.nextDouble();
		celsius = (fahrenheit - 32) * CONVERSION_RATE;
		System.out.println("Celsius Temperature Is: " + celsius);
		
	}
}
