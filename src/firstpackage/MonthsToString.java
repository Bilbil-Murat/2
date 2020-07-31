package firstpackage;
import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        /* Convert month numbers to string
        - Sample input : 6
                output: June

        */

        int month = 5;
        String monthText;
        switch (month) {

            case 1:
                //System.out.println();
                monthText="January";
                break;
            case 2:
                monthText="February";
                break;
            case 3:
                monthText=" March";
                break;
            case 4:
                monthText="April";
                break;
            case 5:
                monthText="May";
                break;
            case 6:
                monthText="June";
                break;
            case 7:
                monthText="July";
                break;
            case 8:
                monthText="Agust";
                break;
            case 9:
                monthText="September";
                break;
            case 10:
                monthText="October";
                break;
            case 11:
                monthText="Novermber";
                break;
            case 12:
                monthText="December";
                break;
                        default:
                System.out.println("Only 1-12");
            break;



        }

    }
}
