package firstpackage;

import java.util.Scanner;

public class ComputerScienceskills {
    public static void main(String[] args) {
        /*   Question
         Ask user Computer Science Skills
        1.If it is Java (Ask QA score 0-100)
        2.If it is SQL (Ask Hacckerank score)
        3. If it is Cloud (Ask certification)
        */
     /*   Scanner myScanner=new Scanner (System.in);
        System.out.println("Computer Science Skills: ( JAVA/ SQL/ CLOUD )  ?");
        String answer = myScanner.next();

    if (answer.equalsIgnoreCase("java")) {
        System.out.println("What is your java score? (0-100):  ");
        int javaScore = myScanner.nextInt();
          if(javaScore>=60){
              System.out.println("That is goog score");
          }
          else{
              System.out.println("not bad score ");
          }
    }
    else if (answer.equalsIgnoreCase("sql")){
        System.out.println("What is your Hackaround score? (0-1000) : ");
    }
    else if (answer.equalsIgnoreCase("cloud")) {
        System.out.println("Do you have Certificate (Y/N): ");
        String answerAboutCertificate =myScanner.next();
        if(answerAboutCertificate.equalsIgnoreCase("Y")){
            System.out.println(("Huge plus"));
    }
        else if (answerAboutCertificate.equalsIgnoreCase("N")){
            System.out.println("you should get one");
        }
        else System.out.println("Sorry only  java/sql/cloud");
    } */

    Scanner myScan = new Scanner(System.in);
        System.out.println("What kind of Computer skills you have  JAVA SQL or CLOUD");
        String answer=myScan.nextLine();
        if(answer.equalsIgnoreCase("Java")) {
            System.out.println("What is your QA score : ?");
            int score = myScan.nextInt();
            if (score > 100) {
                System.out.println("GOOD Score");
            } else {
                System.out.println("You should practice more ");
            }
        }
        else if(answer.equalsIgnoreCase("SQL")){
            System.out.println( "What is your  Hackaround score :");
            int score = myScan.nextInt();
            if (score<100){
                System.out.println("Good Score ");
            }
            else {
                System.out.println("You should practice more ");
            }
        }
        else if (answer.equalsIgnoreCase("Cloud")){
            System.out.println("Do you have a Certification : ?");

        }











     }
     }






