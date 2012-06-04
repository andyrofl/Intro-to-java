/**
 * Author: Andy Pacher
 * Date: May 13th, 2011
 * Assignment: CoinClient.java
 */

public class CoinClient {
	public static void main(String[] args) {
		Coin nickel = new Coin();
		String result;
		nickel.flipCoin();
		
		if (nickel.showFace() == true) {
			result = new String("Heads Up!");
		}
		else {
			result = new String("Tails Up!");
		}
		System.out.print(result);
	}
}