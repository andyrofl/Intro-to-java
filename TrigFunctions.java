/**
 * Author: Andy Pacher
 * Date: Apr 5th, 2011
 * Assignment: TrigFunctions.java
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class TrigFunctions {
	public static void main(String[] args){
		double t3hradian, sin, cos, tan, number ;
		Scanner sc = new Scanner(System.in) ;
		
		NumberFormat minimum = NumberFormat.getNumberInstance();
		minimum.setMinimumFractionDigits(3);
		
		System.out.println("Enter an angle in degrees: ");
		number = sc.nextDouble();

		t3hradian = Math.toRadians(number);
		sin = Math.sin(t3hradian);
		cos = Math.cos(t3hradian);
		tan = Math.tan(t3hradian);

		System.out.println("Sine: " + minimum.format(sin));
		System.out.println("Cosine: " + minimum.format(cos));
		System.out.println("Tangent: " + minimum.format(tan)); 
		
	}
}
