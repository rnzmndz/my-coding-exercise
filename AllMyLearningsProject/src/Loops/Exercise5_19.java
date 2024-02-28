package Loops;

/**##Overview
 * 
 * This Exercise will print the pyramid of the power of 3's
 * 
 */
public class Exercise5_19 {
	public static void main(String[] args) {
		for (int i = 8; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("\t");
			for (int k = 0; k < 9-i;k++)
				System.out.print("\t" + (int) Math.pow(3, k));
			for (int l = 7-i; l > -1; l--)
				System.out.print("\t" + (int) Math.pow(3, l));
			System.out.println();
		}

	}

}
