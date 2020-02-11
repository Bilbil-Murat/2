package firstpackage;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter the temperature :");
        int temperature = myscanner.nextInt();

        if (temperature <= 21) { // if temp is below 20 degrees
            System.out.println("WINTER");
        }
        else if (temperature <= 40) {
            System.out.println("Fall");
        }
        else if (temperature >= 41 && temperature<60) {
            System.out.println("SPRING");
        }
        else{
            System.out.println(" Summer");
            System.out.println();
        }
    }
}
