package Loops;

import java.util.Scanner;

/**##Overview
 * 
 * This program will prompt you to enter a score, the passing score is greater or equal to 60
 * 
 * ##Sample
 * 
 * Enter your score: 80
 * You pass the exam
 * Enter your score: 59
 * You don’t pass the exam
 * 
 * Enter your score: −1
 */
public class Exercise5_1 {

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//This loop will let you enter a number until you stop it using -1 as an input
		while(true) {
			//This will prompt you to enter a score
			System.out.print("Enter your score: ");
			int score = input.nextInt();
			
			//If the input is -1 the it will stop the loop
			if (score == -1)
				break;
			
			//Check if the score is passed or failed
			if (score >= 60)
				System.out.println("You pass the exam");
			else
				System.out.println("You don’t pass the exam");
		}

	}


}
