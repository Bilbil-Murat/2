package firstpackage;
import java.util.Scanner;
public class outputqueastion {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Please Ask question  Math? or Art? : " ) ;
        String choise=myScanner.next();

        if (choise.equalsIgnoreCase("Math")){
            System.out.println("Tutor? (Y/N)");
            String tutor=myScanner.next();
            if (tutor.equalsIgnoreCase("Yes")){
                System.out.println("OK");
            }
            if (tutor.equalsIgnoreCase("No")){
                System.out.println("Study your self");
            }
    }else if (choise.equalsIgnoreCase("Art")){
            System.out.println("Very nice choice no headache");
        }


    }
}
