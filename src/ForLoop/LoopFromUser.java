package ForLoop;
import java.util.Scanner;
public class LoopFromUser {
    public static void main(String[] args) {
        /*
           Print from use start point
           Than ask from user end  point
          than ask what you would like to print
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter starting  point : ");
        int start = scanner.nextInt();
        System.out.println("Enter end point :  ");
        int end = scanner.nextInt();
        System.out.println("Enter what you want to print : ");
        String toPrint=scanner.next();
        for (int i =start; i<end ; i++){
            System.out.println(toPrint);
        }
    }
}
