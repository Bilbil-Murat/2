package firstpackage;

import java.util.Scanner;

public class ComputerScienceskills {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner (System.in);
        System.out.println("Computer Science Skills: (Java/sql/cloud )?");
        String answer = myScanner.next();

    if (answer.equalsIgnoreCase("java")){
        System.out.println("what is your java score? (0-100): ");
        int javaScore =myScanner.nextInt();
    }
    else if (answer.equalsIgnoreCase("sql")){
        System.out.println("What is your Hackerrenk score? (0-1000) : ");
    }
    else if (answer.equalsIgnoreCase("cloud")) {
        System.out.println("Do you have Certificate (Y/N): ");
        String certificate =myScanner.next();
        if(certificate.equalsIgnoreCase("Y")){
            System.out.println(("Huge plus"));
    }
        else if (certificate.equalsIgnoreCase("N")){
            System.out.println("you should get one");
        }
 else System.out.println("ONLY java/sql/cloud");   }
}
}