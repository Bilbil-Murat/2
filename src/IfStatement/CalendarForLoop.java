package IfStatement;
public class CalendarForLoop {
    public static void main(String[] args) {
        //Write the dates with for nested loop
        for (int month = 1; month <= 12; month++) {
            System.out.println("Mount : "+ month+"\n____________________");
            for (int day = 1; day < 31; day++) {
                System.out.println(month + " / " + day + "/2020 year");
            }
            if (month != 12) {
                System.out.println("-------------------");
            }
        }
    }
}
