/**
 * Author: Andy Pacher
 * Date: May 4th, 2011
 * assignment: ArrayFun.java
 */

import java.util.Scanner;

public class ArrayFun{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		
		System.out.print("How many random numbers should I generate Master? ");
		
		do{
			if(sc.hasNextInt()){
				int i = sc.nextInt();
				if(i > 0){
					userNumber = i;
					break;
				}
			}
			System.out.print("NO. YOU LOSE. try again ");
		}
		while (userNumber <= 0);
		
		for(int i = 0; i < userNumber; i++){
			System.out.print(((int)(Math.random() * 100) + 1) + " ");
		}
	}
}
