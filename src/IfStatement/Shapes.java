package firstpackage;
import java.util.Scanner;
public class Shapes {
    public static void main(String[] args) {
        //Creating Scanner object to read from keyboard
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter C, R, or T : ");
        //receiving answer from the user
        String shape = myScan.next();

        if (shape.compareTo("c") == 0) { //For the circle
            //ask radius from user
            System.out.println();

        } else if (shape.compareToIgnoreCase("r") == 0) {
            //ask edges from user
            System.out.print("Please enter edge 1 :");
        }

    }
}
