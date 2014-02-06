package acsl.search;

import java.util.*;

public class Search {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		String[] input = new String[11];
		for(int i = 1; i <= 11; i++){
			System.out.println("Enter line " +i+ ":");
			input[i-1] = reader.nextLine();
		}
		
		// test inputs
		/*input[0] = "PEACH_PIT, TEACH, EACH, PREACH, OUTREACH, PREACHER, SLEEP, ACHE, ARCHER, RESEARCH";
		input[1] = "P";
		input[2] = "[A";
		input[3] = "E?CH";
		input[4] = "*AC";
		input[5] = "P+L";
		input[6] = "?P&E";
		input[7] = "S+ER";
		input[8] = "RE&ER";
		input[9] = "P+I&H";
		input[10] = "R&I+T";*/
		
		List<String> searchData = Arrays.asList(input[0].split(","));
		
		for(String s : input){
			if(s.charAt(0) == '['){
				containsAtBeginning(s, searchData);
			}
			else if(s.charAt(s.length() - 1) == ']'){
				containsAtEnd(s, searchData);
			}
			else if(contains("?",s)){
				String p1 = s.substring(0, s.indexOf("?"));
				String p2 = s.substring(s.indexOf("?"));
				searchSkipOne(p1, p2, searchData);
			}
			else if(contains("*",s)){
				// TODO write method
			}
			else if(contains("+",s)){
				String p1 = s.substring(0, s.indexOf("+"));
				String p2 = s.substring(s.indexOf("+"));
				containsOr(p1, p2, searchData);
			}
			else if(contains("&",s)){
				String p1 = s.substring(0, s.indexOf("&"));
				String p2 = s.substring(s.indexOf("&"));
				containsAnd(p1, p2, searchData);
			}
			else{
				search(s, searchData);
			}
		}
	}
	
	public static void search(String x, List<String> y){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : y){
			if(contains(x,s)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()-1){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static void containsAtEnd(String x, List<String> y){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : y){
			if(s.substring(s.length() - x.length()).equals(x)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()-1){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static void containsAtBeginning(String x, List<String> y){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : y){
			if(s.substring(0, x.length()).equals(x)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()-1){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static void searchSkipOne(String x, String z, List<String> y){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : y){
			int firstOccur = s.indexOf(x);
			if(firstOccur != -1 && firstOccur < z.length() && s.substring(firstOccur+1, firstOccur+z.length()).equals(z)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static void searchSkip(String x, String z, List<String> y){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : y){
			int firstOccurence = s.indexOf(x);
			String temp = null;
			if(firstOccurence != -1) temp = s.substring(firstOccurence+1);
			if(!s.equals(null) && temp.indexOf(z) != -1){
				results.add(s);
			}
		}
	}
	
	public static void containsOr(String x, String y, List<String> z){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : z){
			if(contains(x, s) || contains(y, s)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static void containsAnd(String x, String y, List<String> z){
		ArrayList<String> results = new ArrayList<String>();
		for(String s : z){
			if(contains(x, s) && contains(y, s)){
				results.add(s);
			}
		}
		for(int i = 0; i < results.size(); i++){
			if(i == results.size()){
				System.out.print(results.get(i));
				System.out.println();
			}
			else{
				System.out.print(results.get(i) + ", ");
			}
		}
	}
	
	public static boolean contains(String c, String in){
		return in.contains(c);
		
		/*
		 * Dear Mrs. Hohwald:
		 * 
		 * I would like to apologize for this method's existence. I was not aware that the 
		 * contains() method was already part of the Java API, and it was much easier to 
		 * just redirect this function than to rewrite all of its dependencies.
		 * 
		 * Sincerely,
		 * Drew Higgins
		 */
	}
}