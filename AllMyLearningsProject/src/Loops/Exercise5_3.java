package Loops;

/**##Overview
 * 
 * This program will make a conversion table for Temperature
 * 
 */
public class Exercise5_3 {
	public static void main(String[] args) {
		System.out.println("Celsius   Fahrenheit");
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i + "\t  " + i*(9/5+32));
		}

	}

}
