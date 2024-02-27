package mathematicalFunctionCharactersString;
import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		System.out.println(String.format("The area of the pentagon is %.2f",pentagonArea(length)));

	}
	public static double pentagonArea(double length) {
		double side = 2 * length * Math.sin(Math.PI/5);
		return (5 * Math.pow(side, 2)/(4 * Math.tan(Math.PI/5)));
	}

}
