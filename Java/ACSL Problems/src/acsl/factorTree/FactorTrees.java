package acsl.factorTree;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorTrees {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int[] input = new int[10];
		for (int i = 0; i < 10; i++){
			System.out.println("Enter number " +(i+1)+": ");
			input[i] = reader.nextInt();
		}
		for (int j = 0; j < 10; j++){
			factorInt(input[j]);
			System.out.println();
		}
	}
	
	public static void factorInt(int x){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		factors.add(x);
		do{
			for(int i = 0; i < factors.size(); i++){
				if(isCompletelyFactored(factors)){
					break;
				}
				else{
					if(!isPrime(factors.get(i))){
						int[] f = splitIntoFactors(factors.remove(i));
						factors.add(i, f[0]);
						factors.add(f[1]);
						System.out.println();
						for(i = 0; i < factors.size(); i++){
							if((i+1) == factors.size()){
								System.out.print(factors.get(i));
							}
							else{
								System.out.print(factors.get(i) + " x ");
							}
						}
					}
				}
			}
		}while(!isCompletelyFactored(factors));
		if(isCompletelyFactored(factors)){
			exponentiate(factors);
		}
	}
	public static void exponentiate(ArrayList<Integer> f1){
		ArrayList<Integer> checked = new ArrayList<Integer>();
		ArrayList<String> f = new ArrayList<String>();
		for(int i : f1){
			if(containsInt(i, checked) == 0){
				checked.add(i);
			}
		}
		System.out.println();
		for(Integer i : checked){
			if(containsInt(i, f1) == 1){
				f.add(i.toString());
			}
			else{
				f.add(i + "^" + containsInt(i, f1));
			}
		}
		for(int i = 0; i < f.size(); i++){
			if(i == f.size()-1){
				System.out.print(f.get(i));
			}
			else{
				System.out.print(f.get(i) + " x ");
			}
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
	// precondition: argument is not prime
	public static int[] splitIntoFactors(int x){
		int[] f = new int[2];
		for(int i = 2; i < x; i++){
			if(x % i == 0){
				f[0] = i;
				f[1] = x/i;
				break;
			}
		}
		return f;
	}
	public static boolean isCompletelyFactored(ArrayList<Integer> a){
		for(int i : a){
			if(!isPrime(i)){
				return false;
			}
		}
		return true;
	}
	public static int containsInt(int x, ArrayList<Integer> a){
		int count = 0;
		for(int i : a){
			if(i==x){
				count++;
			}
		}
		return count;
	}
}