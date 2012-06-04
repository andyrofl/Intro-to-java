/**
 * Author: Andy Pacher
 * Date: Apr 5th, 2011
 * Assignment: Quadratic.java
 */

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double A, B, C, putout1stDate, putout2ndDate, squareRoot, discriminant ; 	
		
		System.out.println("Enter the value of a: ");
		A = sc.nextDouble();
		System.out.println("Enter the value of b: ");
		B = sc.nextDouble();
		System.out.println("Enter the value of c: ");
		C = sc.nextDouble();
		
		discriminant = (B * B) - (4 * A * C);
		squareRoot = Math.sqrt(discriminant);
		
		putout1stDate = ((B * -1) + squareRoot) / (2 * A) ;
		putout2ndDate = ((B * -1) - squareRoot) / (2 * A) ;


		
		if (discriminant > 0.00000000001 ){
			System.out.println("The roots are: " + putout1stDate + " and " + putout2ndDate);

		}else if (discriminant > -0.00000001) { 
			System.out.println("The root is: " + putout1stDate);

		}else{
			System.out.println("OMG you haz no r00tz!");
		}
	}
}
