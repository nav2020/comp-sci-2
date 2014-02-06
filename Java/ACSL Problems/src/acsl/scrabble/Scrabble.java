package acsl.scrabble;
import java.util.*;
public class Scrabble {

	/**
	 * @author Drew Higgins
	 * ACSL Scrabble Program
	 * 11/7/2013
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] input = new String[6];
		for(int i = 0; i < 6; i++){
			System.out.println("Enter line " +(i+1)+ ":");
			input[i] = reader.nextLine();
		}
		String word = input[0].replaceAll(", ", "").toUpperCase();
		ArrayList<String> positions = new ArrayList<String>();
		for(int i = 1; i < 6; i++){
			input[i] = input[i].replaceAll(" ", "");
			positions.add(input[i]);
		}
		for(String s : positions){
			List<String> cmds = Arrays.asList(s.split(","));
			int highestScore = 0;
			for(int i = 0; i < 5; i+=2){
				int currentScore = calcScore(word, Integer.parseInt(cmds.get(i)), cmds.get(i+1).charAt(0));
				if(currentScore > highestScore){
					highestScore = currentScore;
				}
			}
			System.out.println(highestScore);
		}
	}
	public static int calcScore(String s, int x, char a){
		int score = 0;
		boolean tripWord = false, doubWord = false;
		if(a == 'H'){
			for(char c : s.toCharArray()){
				if(isTripleLetterScore(x)){
					score += findLetterValue(c)*3;
				}
				else if(isDoubleLetterScore(x)){
					score += findLetterValue(c)*2;
				}
				else{
					score += findLetterValue(c);
				}
				if(isTripleWordScore(x)){
					tripWord = true;
				}
				else if(isDoubleWordScore(x)){
					doubWord = true;
				}
				x++;
			}
			if(tripWord){
				score *= 3;
			}
			if(doubWord){
				score *= 2;
			}
		}
		else if(a == 'V'){
			for(char c : s.toCharArray()){
				if(isTripleLetterScore(x)){
					score += findLetterValue(c)*3;
				}
				else if(isDoubleLetterScore(x)){
					score += findLetterValue(c)*2;
				}
				else{
					score += findLetterValue(c);
				}
				if(isTripleWordScore(x)){
					tripWord = true;
				}
				else if(isDoubleWordScore(x)){
					doubWord = true;
				}
				x += 10;
			}
			if(tripWord){
				score *= 3;
			}
			if(doubWord){
				score *= 2;
			}
		}
		return score;
	}
	public static boolean isDoubleLetterScore(int x){
		int[] doubleLetterScores = {3,9,15,21,27,33,39};
		for(int i = 0; i < 7; i++){
			if(doubleLetterScores[i] == x){
				return true;
			}
		}
		return false;
	}
	public static boolean isTripleLetterScore(int x){
		int[] tripleLetterScores = {5,10,20,25,30,35,40};
		for(int i = 0; i < 6; i++){
			if(tripleLetterScores[i] == x){
				return true;
			}
		}
		return false;
	}
	public static boolean isDoubleWordScore(int x){
		int[] doubleWordScores = {7,14,28};
		for(int i = 0; i < 3; i++){
			if(doubleWordScores[i] == x){
				return true;
			}
		}
		return false;
	}
	public static boolean isTripleWordScore(int x){
		int[] tripleWordScores = {8,16,24,32};
		for(int i = 0; i < 4; i++){
			if(tripleWordScores[i] == x){
				return true;
			}
		}
		return false;
	}
	public static int findLetterValue(char a){
		if(a == 'A' || a == 'E'){
			return 1;
		}
		else if(a == 'D' || a == 'R'){
			return 2;
		}
		else if(a == 'B' || a == 'M'){
			return 3;
		}
		else if(a == 'V' || a == 'Y'){
			return 4;
		}
		else if(a == 'J' || a == 'X'){
			return 8;
		}
		else{
			return 0;
		}
	}
}