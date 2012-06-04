/**
 * Author: Andy Pacher
 * Date: Mar 24th, 2011
 * Assignment: Discriminant.java
 */

import java.util.Scanner;

public class Discriminant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, discriminant;		
		
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		c = sc.nextInt();
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant > .0001){
			System.out.println("Two roots");
		}else if (discriminant > -0.0001){
			System.out.println("One root");
		}else {
			System.out.println("No roots");
		}
	}

}
