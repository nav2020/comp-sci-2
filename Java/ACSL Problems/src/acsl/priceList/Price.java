package acsl.priceList;

public class Price implements Comparable<Price> {
    private Date startDate, endDate;
    private double price;

    public Price(String startDate, String endDate, double price) {
        this.startDate = new Date(startDate);
        this.endDate = new Date(endDate);
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    // postcondition: returns -1 if this date is before arg, 0 is equal, and 1 if after
    public int compareTo(Price p) {
        if(this.getStartDate().getMonth() < p.getStartDate().getMonth()){
            return -1;
        }
        else if(this.getStartDate().getMonth() == p.getStartDate().getMonth()){
            if(this.getStartDate().getDay() < p.getStartDate().getDay()){
                return -1;
            }
            else if(this.getStartDate().getDay() == p.getStartDate().getDay()){
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

    public String toString(){
        return startDate.toString() + "-" + endDate.toString() + "   " + price;
    }
}
