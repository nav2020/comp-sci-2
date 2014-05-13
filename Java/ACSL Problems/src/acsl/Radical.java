package acsl.radical;

import java.util.*;

public class Radical {

	/**
	 * @author Drew Higgins ACSL Radical 04/28/2014
	 */
	public static void main(String[] args) {
		// Scanner reader = new Scanner(System.in);
		// System.out.println("Enter your input: ");
		// String input = reader.nextLine();
		int[] input = {0, 1, 18};
		boolean cNeg = false;
		if(isPerfectSquare(input[2])){
			System.out.println((int)Math.sqrt(input[2])*input[1] + input[0] + ", 0, 0");
			return;
		}
		if(input[2] < 0){
			cNeg = true;
			input[2] = Math.abs(input[2]);
		}
		if (input.length == 3) {
			ArrayList<Integer> f = primeFactors(input[2]);
			ArrayList<Integer> squares = new ArrayList<Integer>();
			ArrayList<Integer> primes = new ArrayList<Integer>();
			System.out.println(f.toString());
			while(f.size() > 0){
				if (f.get(0) == f.get(1)){
					squares.add(f.remove(0));
					squares.add(f.remove(0));
				}
				else{
					primes.add(f.remove(0));
				}
			}
			int squareProd = 1, primeProd = 1;
			// boolean isNeg = false;
			for(Integer i : squares){
				squareProd *= i;
			}
			for(Integer i : primes){
				primeProd *= i;
			}
			squareProd = (int) Math.sqrt(squareProd) * input[1];
			if (cNeg){
				System.out.println(input[0] + ", " + squareProd + "i , " + primeProd);
			}
			else{
				System.out.println(input[0] + ", " + squareProd + ", " + primeProd);
			}
		} 
		else {
			// TODO: Write operator handling function
		}
	}

	public static ArrayList<Integer> primeFactors(int numbers) {
		int n = numbers;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	public static boolean isPerfectSquare(int i) {
		double sq = Math.sqrt((double) i);
		if (sq == (int) sq) {
			return true;
		} 
		else {
			return false;
		}
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean allNumbersDifferent(ArrayList<Integer> l){
		int[] a = new int[l.size()];
		for(int i = 0; i < l.size(); i++){
			a[i] = l.get(i);
		}
		Arrays.sort(a);
		for(int i = 0; i < l.size() - 1; i++){
			if(l.get(i) == l.get(i+1)){
				return false;
			}
		}
		return true;
	}
}
