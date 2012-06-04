/**
 * Author: Andy Pacher
 * Date: Mar 10th, 2011
 * Assignment: Sleep.java
 */

import java.util.Scanner;

public class Sleep {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int birthYear, birthMonth, birthDay, todayYear, todayMonth, todayDay, years, days, months, daysAlive, hoursSlept;
		
		System.out.println("Enter your birthday");
		System.out.print("year: ");
		birthYear = sc.nextInt();
		System.out.print("month: ");
		birthMonth = sc.nextInt();
		System.out.print("day: ");
		birthDay = sc.nextInt();
		
	
	    System.out.println("Enter current date");
	    System.out.print("year: ");
		todayYear = sc.nextInt();
		System.out.print("month: ");
		todayMonth = sc.nextInt();
		System.out.print("day: ");
		todayDay = sc.nextInt();
		
		
		years = (todayYear - birthYear) * 365;
		months = (todayMonth - birthMonth) * 30;
		days = (todayDay - birthDay);
		daysAlive = years - months - days;
		hoursSlept = daysAlive * 8;
		
		
		System.out.print("you have been alive " +daysAlive);
		System.out.println(" days");
		System.out.print("you have slept " +hoursSlept);
		System.out.println(" hours");
		
	}
}