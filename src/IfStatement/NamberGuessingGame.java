package IfStatement;

import java.util.Scanner;

public class NamberGuessingGame {
    public static void main(String[] args) {
        Scanner myScan= new Scanner(System.in);
        System.out.println("Please Guess the number  :  ?");
        int number = myScan.nextInt();
        int userGuessNumber=50;
        if(number>userGuessNumber){
            System.out.println("Larger try again");
        }
        else if(number<userGuessNumber){
            System.out.println("Smaller try again ");
        }
        else {
            System.out.println("Congrats");
        }
        String answer= "";
         while(answer.equalsIgnoreCase("y")){
             System.out.println(" Lets try again");
             answer= myScan.next();
         }
    }
}
