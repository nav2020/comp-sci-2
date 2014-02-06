package extraCredit;
import java.util.*;

public class WordPalindrome {

	/**
	 * @author Drew Higgins
	 * Word Palindrome EC Problem
	 * 11/12/13
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the sentence you want to check:");
		String input = reader.nextLine();
		
		List<String> wordsList = Arrays.asList(input.split(" "));
		ArrayList<String> words = new ArrayList<String>();
		for (String s : wordsList){
			words.add(s);
		}
		for(String w : words){
			w = w.toUpperCase();
			w = w.trim();
		}
		boolean works = true;
		if(words.size() % 2 != 0){
			String middleWord = words.remove(words.size() / 2);
			String backward = "";
			for(int b = middleWord.length() - 1; b >= 0; b--){
				backward += "" + middleWord.charAt(b);
			}
			works = backward.equals(middleWord);
		}
		int j = words.size() - 1;
		for(int i = 0; i < words.size() && j >= 0 && works; i++){
			if(!(words.get(i).equals(words.get(j)))){
				works = false;
			}
			j--;
		}
		if(works){
			System.out.println("It IS a palindromic sentence! :)");
		}
		else{
			System.out.println("It is NOT a palindromic sentence! :(");
		}
	}
}