package firstpackage;
import java.util.Scanner;
public class Decision {
    public static void main(String[] args) {
        Scanner scanItems = new Scanner(System.in);
        System.out.println("Please enter the color (blue/red) :");
        String color = scanItems.nextLine();
        System.out.println("Please enter tag price : ");
        double priceTag = scanItems.nextDouble();
        System.out.println("P;ease enter discount percentage (0.1-0.9):");
        float discount = scanItems.nextFloat();

        int colorValue = 0;
        if (color.compareToIgnoreCase("red") == 0) {
            colorValue = 20;
        } else if (color.compareToIgnoreCase("blue") == 0)
            colorValue = 10;
        else System.out.println(("red or blue only"));
    }



    }



