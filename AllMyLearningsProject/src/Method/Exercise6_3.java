package Method;

/**##Overview
 * 
 * This Program check if the number is Palindrome
 * 
 */
public class Exercise6_3 {
	public static void main(String[] args) {
		System.out.print(isPalindrome(121));
	}
	
	/**
	 * @param number - number to Reverse
	 * @return Reversed number
	 */
	public static int reverse(int number) {
		String toReverse = String.valueOf(number);
		String reversedString = "";
		for (int i = toReverse.length() - 1; i >= 0; i--)
			reversedString = reversedString + toReverse.charAt(i);
		return Integer.parseInt(reversedString.toString());
	}
	
	  /**
	 * @param number - to check if it is Palindrom Number
	 * @return Boolean if it is Palindrome or not.
	 */
	public static boolean isPalindrome(int number) {
		  return number == reverse(number);
	  }
}
