package firstpackage;

public class CalendarWhileLoop {
    public static void main(String[] args) {
        //Write the Calendar with nested while loop
        int month=1;
        while(month<=12){
            int day=1;// we are resetting the day value
            while(day<31){
                System.out.println(month+"-"+day+"-"+"2020 year");
                day++;// we are increasing the day
            }
            month++; // we are increasing the month
        }
    }
}
