/**
 * Author: Andy Pacher
 * Date: Mar 14th, 2011
 * Assignment: TimeConversion.java
 */

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args){
		
		Scanner idkLol = new Scanner(System.in);
		int timeMinutes, timeHours, remainderMinutes;
		
		System.out.println("Enter the time in minutes: ");
		timeMinutes = idkLol.nextInt();
		
		timeHours = timeMinutes / 60;
		remainderMinutes = timeMinutes % 60;
		
		if (remainderMinutes < 10)
			System.out.print("The time is: " + timeHours + ":0" + remainderMinutes);
		else
			System.out.print("The time is: " + timeHours+ ":" + remainderMinutes);
	}

}
