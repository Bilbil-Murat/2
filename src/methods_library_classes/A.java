package methods_library_classes;
import java.util.Scanner;
   public class A {
    public static int number() {
        return 10;
    }
    public int number2() {
        return 10;
    }
    public static void main(String[] args) {
        int num[][] = new int[1][3];
        int[][] convert = num;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }
    }
    public static void culculateGivenNumber() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter  the first  number ");
        int firstNumber = myScan.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = myScan.nextInt();
        System.out.println("Do you want you to me  calculate ? ");
        String answer = myScan.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println(Math.pow(firstNumber, secondNumber));
        }
        else {
            System.out.println("First Number is :" + firstNumber + "and Second number is : " + secondNumber);
        }
    }
}