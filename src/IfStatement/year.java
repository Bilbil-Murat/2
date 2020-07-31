package firstpackage;
import java.util.Scanner;
public class year {
    public static void main(String [] args){
        // Leap year, if it is divisible by 4 and 400 but , not by 100.

       Scanner myScanner= new Scanner(System.in);
       System.out.println("Please enter a year ");
        int year=myScanner.nextInt();
        if (year>=2000){
            System.out.println("After Milenium");
        }
        else{
            System.out.println("Before milenium");
        }


    }
}
