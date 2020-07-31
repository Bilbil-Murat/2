package IfStatement;
import java.util.Scanner;
public class AGEINFORMATION {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int age = myScanner.nextInt();
        if (age < 0) {
            System.out.println("Can not be negative");
        }
    else if  ( age>=120){
        System.out.println("Can not be larger than 120");
    }
    else{
        System.out.println("Ok");

}
}
}