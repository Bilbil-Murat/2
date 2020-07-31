package methods_library_classes;

import java.util.Scanner;

public class Game {
    public static void Number_Guessing(int actual){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Hello my friend ");
        System.out.println(" ARE YOU READY  ? ");
         int Guessed_number= 0;
        while (Guessed_number!=actual) {

            System.out.println("Lets start guess the any number :  ?");
            Guessed_number = myScan.nextInt(); // int Guessed_number=myScan.nextInt();
            if (Guessed_number > actual) {

                System.out.println(Guessed_number + "  this numbers is Large, try again.");
            } else if (Guessed_number < actual) {

                System.out.println(Guessed_number + "  this number is Small, try again ");
            } else {

                System.out.println("CONGRATULATIONS YOU WIN !");
            }
        }
    }
}
