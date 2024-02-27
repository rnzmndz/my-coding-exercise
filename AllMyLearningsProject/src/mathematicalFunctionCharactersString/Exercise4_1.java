package mathematicalFunctionCharactersString;

 import java.util.Scanner;

/**# Pentagon Area Calculator
 * ## Overview
 * 
 * This program calculates the area of a regular pentagon based on the user-provided length from the center to a vertex.
 * 
 * ## Getting Started
 * 
 * 1. **Run the Program:**
 * 	- Open the Exercise4_1 program in your Java development environment.
 * 	- Execute the program.
 * 
 * 2. **Enter Length:**
 * 	- When prompted, enter the length from the center to a vertex.
 * 
 * 3. **View Result:**
 * 	- The program will calculate and display the area of the pentagon.
 * 
 * ## Formula Used
 * 
 * The area (A) of a regular pentagon is calculated using the following formula:
 * 
 * A = (5 x side^2)/(4 x tan(pi/5))
 * Here, side is calculated as 2 x r sin(pi/5).
 * 
 * ## Example
 * 
 * Suppose you enter the length as 5. The program output will be:
 * 
 * ```plaintext
 * Enter the length from the center to a vertex: 5
 * The area of the pentagon is 43.01
 * 
 */
public class Exercise4_1 {
	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user to input a length
		System.out.print("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		//Prints the result
		System.out.println(String.format("The area of the pentagon is %.2f",pentagonArea(length)));

	}
	public static double pentagonArea(double length) {
		//Formula for side
		double side = 2 * length * Math.sin(Math.PI/5);
		
		//Formula for pentagon Area
		return (5 * Math.pow(side, 2)/(4 * Math.tan(Math.PI/5)));
	}

}
