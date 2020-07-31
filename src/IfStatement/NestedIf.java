package IfStatement;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        int x=1;
        int y=-4;
        if(x!=1){
            System.out.println("Ok");
            if(y<0){
                System.out.println("Hello");
            }
            System.out.println("OK OK OK ");
        }
         int age=16;//second Example of Nested If statement
        Scanner scanner= new Scanner(System.in);
        if(age>=16){
            System.out.println("F for first application , R for renewal");
            String choice = scanner.next();
            if(choice.equals("F")){
                System.out.println("ID,Form,photo");
            }
            else if (choice.equals("R")){
                System.out.println("Old Driving Licence");
            }
            else{
                System.out.println("enter Please F or R");
            }
        }
        else {
            System.out.println("You cannot apply");
        }
        for (int i = 100; i <=1000 ; i+=100) {
           // if(i%2==0){
                System.out.println(i);
            }
        String word="MjnsMHFvnmkK";
        word=word.toUpperCase();
        System.out.println(word);


        }

        }


