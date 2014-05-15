package acsl.priceList;

import java.util.*;

public class PriceList {

	/**
	 * @author Drew Higgins
	 */
	public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
			ArrayList<Price> priceList = new ArrayList<Price>();
			Comparator comp = new PriceComparator();
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Enter input #" + (i+1) + ": ");
			String strInput = reader.nextLine();
			if(i == 0){
                Price p = new Price(strInput.trim());
                priceList.add(p);
            }
            else {
                String[] currentInput = strInput.split(", ");
                System.out.println(currentInput[0] + "|" + currentInput[1] + "|" + currentInput[2]);
                Price current = new Price(currentInput[0], currentInput[1], currentInput[2]);
                priceList.add(current);
                Collections.sort(priceList, comp);
                printPriceList(priceList);
            }
		}
	}    
	
	public static void printPriceList(ArrayList<Price> pl) {
        for(Price p : pl) {
            System.out.println(p.toString());
        }
    }
}
