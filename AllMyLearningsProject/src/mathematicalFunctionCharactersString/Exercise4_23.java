package mathematicalFunctionCharactersString;

import java.util.Scanner;

/**##Overview
 * 
 * This program will prompt you to input a data for purchasing coffee
 * then it will give you an output after you press Enter.
 * 
 */
public class Exercise4_23 {
	static String name;
	static int numberOfCoffee;
	static float price;
	static float discount;
	static float memberDiscount;
	static String[] output = new String[9];

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts you to enter customer's name
		System.out.print("Enter customer’s name: ");
		name = input.next();
		
		//Prompts you to enter number of coffees
		System.out.print("Enter number of coffees bought in total: ");
		numberOfCoffee = input.nextInt();
		
		//Prompts you to enter average coffee price
		System.out.print("Enter average coffee price: ");
		price = input.nextFloat();
		
		//Prompts you to enter standard Discount
		System.out.print("Enter standard discount rate: ");
		discount = input.nextFloat();
		
		//Prompts you to enter member's discount
		System.out.print("Enter mailing-list member discount rate: ");
		memberDiscount = input.nextFloat();
		
		System.out.println();
		
		printOutput(input);

	}
	public static void printOutput(Scanner input) {
		float total = price * numberOfCoffee;
		float discountedtotal = total * discount;
		float discountedMemTotal = total * memberDiscount;
		float totalSave = discountedMemTotal + discountedtotal;
		
		//Create an array that will give an output
		output[0] = "Customer Name: " + name;
		output[1] = "Coffees Bought: " + numberOfCoffee;
		output[2] = "Average Coffee Price: $" + price;
		output[3] = "Total Spending on Coffee: $" + total;
		output[4] = "Discounts:";
		output[5] = String.format("\tStandard discount (%.2f%%): $%.2f", discount * 100, discountedtotal) ;
		output[6] = String.format("\tMailing list membership discount (%.2f): $%.2f", memberDiscount * 100, discountedMemTotal); 
		output[7] = String.format("\tTotal Saved: $%.2f", totalSave);
		output[8] = String.format("Total Spending after Discount: $%.2f", total - totalSave);
		
		//Prints the output if you print enter
		for(int i = 0; i < 9; i++) {
			System.out.print(output[i]);
			input.nextLine();
		}
	}

}
