package methods_library_classes;
import java.util.Date;
public class Daate {
    public static void  printDates(String year, String sepperator) {
     /*   Date myDate= new Date();
        myDate.getHours();
        myDate.getTimezoneOffset();*/
        for (int days = 1; days <= 12; days++) {
            System.out.println("Month: " + days);
            for (int month = 1; month <= 31; month++) {
                System.out.println(days + sepperator + month + sepperator + year);
            }
            System.out.println();
        }


    }

        public static void printGivenNumbers(int number){
            for (int i=1; i<=number ;i++){
                 if(i==6 || i==11){
                    System.out.println("\n");
                }
                System.out.print(i+"\t\n");
        }
            System.out.println("Second for Loop ");


            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(number + "\t");
                    number++;
                }
                System.out.println();

            }
    }
}
