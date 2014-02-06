package extraCredit;
import java.util.*;
public class Number3 {

	/**
	 * @author Max, Abdul, and Drew (x2)
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:");
		String input = reader.nextLine();
		int[] ints = new int[input.length()];
		for(int i = 0; i < ints.length; i++){
			ints[i] = Integer.parseInt(""+input.charAt(i));
		}
		Arrays.sort(ints);
		for(int i = ints.length-1; i >= 0; i--){
			System.out.print(ints[i]);
		}
	}
}