import java.util.*;
public class Arrays_22 {
	public static void main(String[] args) {
		int[] accountNumbers = {1,2,3,4,5};
		String[] names = {"Bob Marks", "Lisa Pappo", "Eric Fisher", "James Finch", "Chris McCormick"};
		double[] balances = {1000000,50000,5,180000,725000};
		
		double mostMoney = 0, leastMoney = Double.MAX_VALUE;
		int mostPos = 0, leastPos = 0;
		double avg = 0;
		for(int i = 0; i < balances.length; i++){
			if(balances[i] > mostMoney){
				mostMoney = balances[i];
				mostPos = i;
			}
			else if(balances[i] < leastMoney){
				leastMoney = balances[i];
				leastPos = i;
			}
			avg += balances[i];
		}
		avg /= balances.length;
		
		String[] firstNames = new String[5];
		String[] lastNames = new String[5];
		
		for(int i = 0; i < names.length; i++){
			String s = names[i];
			String fn = s.substring(0, s.indexOf(' '));
			String ln = s.substring(s.indexOf(' ')+1);
			firstNames[i] = fn;
			lastNames[i] = ln;
		}
		
		Arrays.sort(lastNames);
		for(int i = 0; i < names.length; i++){
			
		}
		
		System.out.println(names[mostPos] + " has the most money in their account.");
		System.out.println(names[leastPos] + " has the least money in their account.");
		System.out.println("The average account contains $" + avg);
		System.out.println(" is alphabetically first.");
	}
}