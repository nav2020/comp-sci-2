package acsl.priceList;

import java.util.Comparator;

public class PriceComparator implements Comparator {
	@Override
	public int compare(Object price1, Object price2) {
		Price p1 = (Price)price1;
		Price p2 = (Price)price2;
		if(p1.getStartDate().getMonth() < p2.getStartDate().getMonth()){
	            return -1;
	        }
	        else if(p1.getStartDate().getMonth() == p2.getStartDate().getMonth()){
	            if(p1.getStartDate().getDay() < p2.getStartDate().getDay()){
	                return -1;
	            }
	            else if(p1.getStartDate().getDay() == p2.getStartDate().getDay()){
	                return 0;
	            }
	            else{
	                return 1;
	            }
	        }
	        else{
	            return 1;
	        }
	}

}
