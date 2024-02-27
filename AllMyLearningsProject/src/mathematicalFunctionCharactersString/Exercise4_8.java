package mathematicalFunctionCharactersString;
import java.util.Scanner;

/**##Overview
 * 
 * This program convert character into ASCII code based on user input
 * 
 * ##Example 
 * Enter a character: E
 * The ASCII code for character E is 69
 */
public class Exercise4_8 {

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user to input a character
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		//Prints the result
		System.out.println("The ASCII code for character E is " + ConvertToASCII(character));
	}
	/**
	 * @param character - to convert into ASCII code
	 * @return Character Converted into ASCII code
	 */
	public static int ConvertToASCII(char character) {
		return (int) character;
	}

}
