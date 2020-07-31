package firstpackage;

public class CalendarMixed {
    public static void main(String[] args) {
        /* Write to down Calendar with while and For loop
        1.Initialization
        2.Condition
        3.Increment or decrement
         */

          int month=1;       /*Starting point*/
        while (month<13){


             for(int day=1; day<31; day++){
                 System.out.println( month+"/"+day+"/"+"2020 year");

             }
             month++;
        }


        //for and while
        int dayWhile;
        for (int monthFor=1; monthFor<13; monthFor++){
            dayWhile=1;
            while (dayWhile<=30){
                System.out.println(monthFor+"-"+dayWhile+"-"+"2020 ");
                dayWhile++;
            }

        }
    }
}
