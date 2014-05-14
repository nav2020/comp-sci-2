package acsl.priceList;

import java.util.*;

/**
 * @author Drew Higgins
 * ACSL Price List
 * 05/13/2014
 */
public class PriceList {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Price> priceList = new ArrayList<Price>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter input #" + i + ": ");
            String temp = reader.nextLine();
            String[] input = temp.split(", ");
            Price current = new Price(input[0].trim(), input[1].trim(), Double.parseDouble(input[2]));
            priceList.add(current);
            Collections.sort(priceList);
            printPriceList(priceList);
        }
    }

    public static void printPriceList(ArrayList<Price> pl) {
        for(Price p : pl) {
            System.out.println(p.toString());
        }
    }
}
