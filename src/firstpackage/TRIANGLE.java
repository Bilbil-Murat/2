package firstpackage;
import java.util.Scanner;
public class TRIANGLE {
    public static void main(String [] args ){
        Scanner myScanner =new Scanner (System.in);
        System.out.print("Please enter number for : A : " );
        float A=myScanner.nextFloat();
        System.out.print("Please enter number for : B : " );
        float B=myScanner.nextFloat();
        System.out.print("Please enter number for : C : " );
        float C=myScanner.nextFloat();

        if((A+B>C) &&(A+C>B) && (B+C>A ) ) {
            System.out.print("\nNOT Triangle");
        }
        else {
            System.out.println("Triangle");


        }
    }

}
