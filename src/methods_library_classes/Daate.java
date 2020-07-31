package methods_library_classes;

public class Date {
    public static String printDates(){
        String myDate= new String();
        for (int days = 1; days <=31 ; days++) {
            for (int month = 0; month <=12 ; month++) {
                myDate=days+"/"+month+"/"+"2020 year";

            }
            System.out.println();
        }
        return myDate;
    }
}
