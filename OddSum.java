/**
 * Name: Andy Pacher
 * Date: Apr 15th, 2011
 * Assignment: OddSum.java
 */

import java.util.Scanner;

public class OddSum {
	public static void main(String[]args){
		Scanner lolz = new Scanner(System.in);
		int numba, loopsRun = 0, tehSum = 0;
		
		System.out.println("Enter a number Ploxxx");
		numba = lolz.nextInt();
		while (numba < 1){
			System.out.println("I SAID ENTER A NUMBER");
			numba = lolz.nextInt();
			loopsRun ++;
		}
		
		if (loopsRun >= 1){
			System.out.print("You screwed up " +loopsRun );
			System.out.println(" times. but i r a robot so here are your numbers : ");
		}else 
			System.out.println("you followed directions. you must be THE ONE the prophecy foretold of. here are your numbers o great chosen one :");
		
		for (int x = 1; x<= numba; x+=2){
			tehSum += x;
			
		}System.out.println(tehSum);
	}
}
/*Enter a number Ploxxx
1
you followed directions. you must be THE ONE the prophecy foretold of. here are your numbers o great chosen one :
1
 * Enter a number Ploxxx
10
you followed directions. you must be THE ONE the prophecy foretold of. here are your numbers o great chosen one :
1
4
9
16
25
 * Enter a number Ploxxx
0
I SAID ENTER A NUMBER
9
You screwed up 1 times. but i r a robot so here are your numbers : 
25
 * 
*/