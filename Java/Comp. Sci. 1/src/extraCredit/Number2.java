package extraCredit;
import java.util.Scanner;

public class Number2 {
	/**
	 * Comp Sci 2
	 * Max, Drew, Drew, Abdul 
	 * Extra Credit MP 1 
	 * Number 2
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num, den, gcd = 0;
		System.out.println("Enter a numerator");
		num = reader.nextInt();
		System.out.println("Enter the denominator");
		den = reader.nextInt();
		for (int i = 1; i < num + den; i++) {
			if (num % i == 0 && den % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		num = num / gcd;
		den = den / gcd;
		System.out.println(num + "/" + den + " and " + gcd);
	}
}