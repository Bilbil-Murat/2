package methods_library_classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Power_OfNumber {
    public static void main(String[] args) {
        /* GIVEN: Calculate the power of given number and power(Sample input : 2 and 3
        Sample output: 8 )*/
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please could you enter the  first number ");
          double base=myScan.nextDouble();
        System.out.println("Please could you enter the  second number ");
          double power=myScan.nextDouble();
        System.out.println("Thank you Let me pow the numbers .......");
          double  number = Math.pow(base,power);
        System.out.println("Here is the  result of power of the : "+number);

    }
}

