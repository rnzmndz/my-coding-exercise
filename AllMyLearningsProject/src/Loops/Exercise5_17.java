package Loops;

import java.util.Scanner;

/**##Overview
 * 
 * This program prints a triangle of number based on your input number
 * 
 */
public class Exercise5_17 {

	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		int number = new Scanner(System.in).nextInt();
		
		for(int i = number; i > 0; i--) {
			for(int j = i; j > 0; j--)
				System.out.print(j + " ");
			for(int k = 2; k < i; k++)
				System.out.print(k + " ");
			System.out.println();
		}

	}

}
