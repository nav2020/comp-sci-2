package acsl.priceList;

public class Price {
    private Date startDate, endDate;
    private double price;

    public Price(String startDate, String endDate, String price) {
        this.startDate = new Date(startDate);
        this.endDate = new Date(endDate);
        this.price = Double.parseDouble(price);
    }

    public Price(String price) {
        this.startDate = new Date(1, 1);
        this.endDate = new Date(6, 30);
        this.price = Double.parseDouble(price);
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

    public String toString(){
        return startDate.toString() + "-" + endDate.toString() + "   " + price;
    }
}
