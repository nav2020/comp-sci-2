package acsl.priceList;

public class Date {
    private int day, month, year;

    public Date(String s) {
        int m = this.convertMonthToInt(s.substring(0, 3));
        this.month = m;
        this.day = Integer.parseInt(s.substring(4, 6));
        this.year = 2004;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int convertMonthToInt(String m) {
        if(m == "JAN") return 1;
        else if(m == "FEB") return 2;
        else if(m == "MAR") return 3;
        else if(m == "APR") return 4;
        else if(m == "MAY") return 5;
        else return 6;
    }

    public String convertIntToMonth(int m) {
        if(m == 1) return "JAN";
        else if(m == 2) return "FEB";
        else if(m == 3) return "MAR";
        else if(m == 4) return "APR";
        else if(m == 5) return "MAY";
        else return "JUN";
    }

    public String toString() {
        return convertIntToMonth(month) + "-" + String.format("{0:00}", day) + "-" + year;
    }
}
