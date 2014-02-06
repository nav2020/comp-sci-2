package acsl.search;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearch {
	public static void main(String args[]){
		String[] input = new String[11];
		Scanner reader = new Scanner(System.in);
		for(int i = 0; i < 11; i++){
			System.out.println("Enter line " +(i+1)+ ":");
			input[i] = reader.nextLine();
		}
		
		List<String> words = Arrays.asList(input[0].split(","));
		ArrayList<String> regex = new ArrayList<String>();
		
		for(String e: words){
			String temp = "";
			temp = e.replaceAll("\\[", "\\^");
			temp = temp.replaceAll("\\]", "\\$");
			temp = temp.replaceAll("\\?", "\\.");
			temp = temp.replaceAll("\\*", "\\.*");
			temp = temp.replaceAll("\\+", "\\|");
			regex.add(temp);
		}
		
		for(String r: regex){
			Pattern p = Pattern.compile(r);
			for(String w: words){
					if(!r.contains("&")){
					Matcher m = p.matcher(w);
					if(m.find()) System.out.print(w + " ");
				}
				else{
					int loc = r.indexOf('&');
					Pattern p1 = Pattern.compile(r.substring(0, loc));
					Pattern p2 = Pattern.compile(r.substring(loc+1));
					if(p1.matcher(w).find()&&p2.matcher(w).find()) System.out.print(w + " ");
				}
			}
			System.out.println();
		}
	}
}