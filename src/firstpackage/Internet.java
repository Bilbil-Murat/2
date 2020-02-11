package firstpackage;
import java.util.Scanner;
public class Internet {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Ask is he/she subscribed or not? (Y/N) ");
        String subscribed = myScanner.next();
         if (subscribed.equals("Y")){
             //ask usage
             int usage=myScanner.nextInt();
             if(usage<101){
                 System.out.println("$10");
             }
             else{
                 System.out.println("$40");
         }

             }
else
System.out.println("Please subscribe");

    }

}
