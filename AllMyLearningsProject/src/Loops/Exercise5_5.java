package Loops;

public class Exercise5_5 {

	public static void main(String[] args) {
		int j = 20;
		System.out.println("Celsius  Farenheit\t|  Fahrenheit   Celsius");
		for(int i = 0; i < 100; i +=2) {
			j += 5;
			float fahrenheit = i * (9/5) + 32;
			float celsius = 5 * (j - 32)/9;
			String conversion = String.format("%d \t %.3f \t|  %d \t       %.3f", i, fahrenheit,j,celsius);
			System.out.println(conversion); 
		}

	}

}
