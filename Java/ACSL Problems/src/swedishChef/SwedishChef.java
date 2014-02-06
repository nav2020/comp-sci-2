package swedishChef;
import java.util.*;

public class SwedishChef {

	/**
	 * @author Drew Higgins
	 * Advanced Swedish Chef
	 * 11/15/2013
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the English sentence: ");
		String english = reader.nextLine();
		String swedish = english.toLowerCase();
		
		swedish = " " + swedish;
		swedish = swedish + " ";
		swedish = swedish.replaceAll("the", "ZEE");
		swedish = swedish.replaceAll("an", "UN");
		swedish = swedish.replaceAll("au", "OO");
		
		// Replace all occurrences of “A” not at the end of a word with “E"
		for(int i = 1; i < swedish.length()-1; i++){
			String cur = swedish.substring(i,i+1);
			if(cur.equals("a") && swedish.charAt(i+1) != ' '){
				String temp = swedish.substring(0, i) + "E" + swedish.substring(i+1);
				swedish = temp;
			}
		}
		
		swedish = swedish.replaceAll("ow", "OO");
		swedish = swedish.replaceAll("o", "U");
		swedish = swedish.replaceAll("ir", "UR");
		swedish = swedish.replaceAll("o", "U");
		swedish = swedish.replaceAll("tion", "SHUN");
		
		// Replace the first occurrence of “I” in a word other than at the start of the word with “EE”.
		for(int i = 1; i < swedish.length(); i++){
			String cur = swedish.substring(i,i+1);
			if(cur.equals("i") && swedish.charAt(i-1) != ' '){
				String temp = swedish.substring(0, i) + "EE" + swedish.substring(i+1);
				swedish = temp;
			}
		}
		
		swedish = swedish.replaceAll("tion", "SHUN");
		swedish = swedish.replaceAll("en ", "EE ");
		swedish = swedish.replaceAll("en.", "EE.");
		swedish = swedish.replaceAll("f", "FF");
		swedish = swedish.replaceAll("e ", "E-A ");
		swedish = swedish.replaceAll("e\\.", "E-A.");
		
		// Replace all occurrences of “U” except at the start of a word with “OO”.
		swedish = swedish.replaceAll(" u", "2");
		swedish = swedish.replaceAll("u", "OO");
		swedish = swedish.replaceAll("2", " u");
		
		swedish = swedish.replaceAll("v", "F");
		swedish = swedish.replaceAll("w", "V");
		swedish = swedish.replace(".", ". BORK BORK BORK!");
		
		swedish = swedish.toUpperCase();
		swedish = swedish.trim();
		System.out.println(swedish);
	}

}
