package com.company;
import java.util.Scanner;
public class Size {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Size S/M/L");
        String size =myScanner.next();
        System.out.println("Member? (Y/N) : ");
        String name =myScanner.next();
        if (size.equals("S")){
            System.out.println("$9.99");
        }
        else if (size.equals("M")) {
            System.out.println("$10.99");
        }
        else if (size.compareToIgnoreCase("L")==0) {
                System.out.println("$11.99");
            }
            else {
                System.out.println("Sorry only S/M/L");
        }

    }
}
